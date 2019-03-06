package android.applanga.com.basicusecasedemo;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by psherif on 01/11/16.
 */

public class ItemManager {

    static ItemManager instance =  null;

    static public ItemManager getInstance(){
        if(instance == null){
            instance = new ItemManager();
        }
        return instance;
    }

    List<Item> itemList = new ArrayList<>();

    List<Item> getListOfItems(){
        if(itemList == null || itemList.size() == 0){
            createDummyItemList();
        }

        return itemList;


    }

    Item getItemForId(long id){
        if(itemList == null || itemList.size() == 0) return null;
        for(Item i : itemList){
            if(i.getId() == id){
                return i;
            }
        }
        return null;
    }

    void createDummyItemList(){

        itemList = new ArrayList<>();

        itemList.add(new Item(
                "Simple Toothbrush",
                "This classical design, requires manual labor but gets the job done.",
                1.99f
        ));

        itemList.add(new Item(
                "Electric Toothbrush",
                "Improving on the classical design this Toothbrush is brushing your teeth for you. Just point at tooth.",
                29.99f
        ));


        itemList.add(new Item(
                "Ultrasonic electric Toothbrush",
                "This amazing piece of dental technology puts the fun back into teeth brushing. Includes massage mode.",
                129.99f
        ));


        itemList.add(new Item(
                "Toothpaste",
                "Simple yet effective at protecting your teeth.",
                0.99f
        ));


        itemList.add(new Item(
                "Menthol Toothpaste",
                "For the extra bit of freshness.",
                1.99f
        ));


        itemList.add(new Item(
                "Fluoride Toothpaste",
                "For long lasting protection.",
                4.99f
        ));

    }
}
