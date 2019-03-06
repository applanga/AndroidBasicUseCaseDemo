package android.applanga.com.basicusecasedemo;

/**
 * Created by psherif on 01/11/16.
 */

public class Item {

    static long idGen = 0;


    long id = idGen++;

    String title = null;
    String Description = null;
    float price = 0;

    String getCurrency(){
        return "€";
    }

    public Item(String title, String description, float price) {
        this.title = title;
        Description = description;
        this.price = price;
    }

    public long getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getDescription() {
        return Description;
    }

    public float getPrice() {
        return price;
    }

    public String getPriceWithCurrency() {
        return Float.toString(price)+getCurrency();
    }
}
