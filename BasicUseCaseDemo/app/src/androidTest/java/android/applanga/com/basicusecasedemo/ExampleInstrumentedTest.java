package android.applanga.com.basicusecasedemo;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.SystemClock;
import android.support.annotation.NonNull;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;
import android.support.test.runner.AndroidJUnit4;

import com.applanga.android.Applanga;
import com.applanga.android.ApplangaCallback;

import org.junit.Rule;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Locale;

import static android.support.test.espresso.Espresso.onView;
import static android.support.test.espresso.action.ViewActions.click;
import static android.support.test.espresso.action.ViewActions.typeText;
import static android.support.test.espresso.matcher.ViewMatchers.withId;
import static org.junit.Assert.*;

/**
 * Instrumentation test, which will execute on an Android device.
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
@RunWith(AndroidJUnit4.class)
public class ExampleInstrumentedTest {
    @Rule
    public ActivityTestRule<LoginActivity> mActivityRule = new ActivityTestRule<>(
            LoginActivity.class);
    @Test
    public void useAppContext() throws Exception {
        runScreenshotAutomation("en");
        runScreenshotAutomation("de");
    }

    void runScreenshotAutomation(final String language) throws Exception {
        if(Locale.getDefault().getDisplayLanguage() != language) {
            List<String> groups = new ArrayList<>();
            groups.add("main");

            List<String> languages = new ArrayList<>();
            languages.add("en");
            languages.add("de");
            Applanga.update(groups, languages, new ApplangaCallback() {
                @Override
                public void onLocalizeFinished(boolean success) {
                    //called if update is complete
                    Applanga.setLanguage(language);
                    Activity activity = mActivityRule.getActivity();
                    Intent mIntent = activity.getIntent();
                    activity.finish();
                    activity.startActivity(mIntent);
                }
            });
        }

        SystemClock.sleep(4000);
        Applanga.captureScreenshot("Login", null);

        // Context of the app under test.
        final Context appContext = InstrumentationRegistry.getTargetContext();

        onView(withId(R.id.email_sign_in_button)).perform(click());
        Applanga.captureScreenshot("LoginWrongPassword", Arrays.asList("error_incorrect_password"));

        onView(withId(R.id.password)).perform(typeText("d"));
        onView(withId(R.id.email_sign_in_button)).perform(click());
        SystemClock.sleep(2000);
        Applanga.captureScreenshot("LoginShortPassword", Arrays.asList("error_invalid_password"));

        onView(withId(R.id.password)).perform(typeText("emo"));
        onView(withId(R.id.email_sign_in_button)).perform(click());
        SystemClock.sleep(2000);
        Applanga.captureScreenshot("ItemList", null);

        onView(withId(R.id.cart_btn)).perform(click());
        SystemClock.sleep(2000);
        Applanga.captureScreenshot("ShoppingCart", null);
        SystemClock.sleep(2000);

    }
}
