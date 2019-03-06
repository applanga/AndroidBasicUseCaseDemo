package android.applanga.com.basicusecasedemo;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.Toast;

import com.applanga.android.Applanga;

public class ShoppingCartActivity extends Activity {

    ListView shoppingCartList = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_shopping_cart_fake);

        //shoppingCartList = (ListView) findViewById(R.id.cart_list);
    }

    public void goBack(View v){
        finish();
    }

    public void pay(View v){
        Context context = getApplicationContext();
        int duration = Toast.LENGTH_SHORT;
        Toast toast = Toast.makeText(context,R.string.buy_message, duration);
        toast.show();
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Applanga.dispatchTouchEvent(ev, this);
        return super.dispatchTouchEvent(ev);
    }

}
