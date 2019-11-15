package android.applanga.com.basicusecasedemo;

import android.content.Intent;
import android.os.Bundle;
import android.app.Activity;
import android.view.MotionEvent;
import android.view.View;
import android.widget.ListView;
import android.widget.TextView;

import com.applanga.android.Applanga;

public class ItemListActivity extends Activity {

    ListView itemListView = null;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_itemlist_fake);
        /*itemListView = (ListView) findViewById(R.id.itemList);


        ArrayAdapter<Item> itemAdapter = new ArrayAdapter<Item>(this, R.layout.itemlist_item, ItemManager.getInstance().getListOfItems()){
            @NonNull
            @Override
            public View getView(int position, View convertView, ViewGroup parent) {
                boolean setData = false;
                if(convertView == null) {
                    Log.i("Applanga", "adapter getView view is null, calling super");
                    convertView = super.getView(position, convertView, parent);
                    setData = true;
                }

                long id = getItemId(position);

                if(setData || convertView.getTag() != id){
                    Item i = getItem(position);
                    TextView tv = (TextView) findViewById(R.id.item_title);

                    //tv.setText();

                    tv = (TextView) findViewById(R.id.item_price);

                    tv = (TextView) findViewById(R.id.item_desc);
                }

                return convertView;
            }
        };*/

    }

    void setUpDummyViews(){
        TextView tv;
        tv = (TextView) findViewById(R.id.item1_title);
        tv = (TextView) findViewById(R.id.item1_desc);
        tv = (TextView) findViewById(R.id.item1_price);


        tv = (TextView) findViewById(R.id.item2_title);
        tv = (TextView) findViewById(R.id.item2_desc);
        tv = (TextView) findViewById(R.id.item2_price);


        tv = (TextView) findViewById(R.id.item3_title);
        tv = (TextView) findViewById(R.id.item3_desc);
        tv = (TextView) findViewById(R.id.item3_price);


        tv = (TextView) findViewById(R.id.item4_title);
        tv = (TextView) findViewById(R.id.item4_desc);
        tv = (TextView) findViewById(R.id.item4_price);
    }

    public void buyItem(View v){
        //long id = (long) v.getTag();
        //SessionManager.getInstance().addItem(ItemManager.getInstance().getItemForId(id));
        showShoppingCart(v);
    }

    public void showShoppingCart(View v){
        Intent intent = new Intent(this, ShoppingCartActivity.class);
        startActivity(intent);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        Applanga.dispatchTouchEvent(ev, this);
        return super.dispatchTouchEvent(ev);
    }

}
