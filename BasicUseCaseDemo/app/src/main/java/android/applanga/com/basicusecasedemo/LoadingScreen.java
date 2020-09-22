package android.applanga.com.basicusecasedemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Window;

import com.applanga.android.Applanga;
import com.applanga.android.ApplangaCallback;

public class LoadingScreen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loading_screen);
        Applanga.init(this);
        Applanga.update(new ApplangaCallback() {
            @Override
            public void onLocalizeFinished(boolean b) {
                loadLoginActivity();
            }
        });
    }


    private void loadLoginActivity()
    {
        Intent intent = new Intent(this, LoginActivity.class);
        startActivity(intent);
    }
}