package android.applanga.com.basicusecasedemo;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by psherif on 01/11/16.
 */

class SessionManager {

    static SessionManager instance =  null;

    static public SessionManager getInstance(){
        if(instance == null){
            instance = new SessionManager();
        }
        return instance;
    }

    Map<Long, Integer> shoppingCart = new HashMap();

    public String getActiveUser() {
        return activeUser;
    }

    public void setActiveUser(String activeUser) {
        this.activeUser = activeUser;
    }

    String activeUser = null;

    public void addItem(Item i){
        if(shoppingCart.containsKey(i.getId()))
        {
            int count = shoppingCart.get(i.getId());
            count ++;
            shoppingCart.put(i.getId(), count);
        }else{
            shoppingCart.put(i.getId(), 1);
        }
    }

    public void removeItem(Item i){

        if(shoppingCart.containsKey(i.getId()))
        {
            int count = shoppingCart.get(i.getId());
            count--;
            if(count <= 0){
                shoppingCart.remove(i.getId());
            }else{
                shoppingCart.put(i.getId(), count);
            }
        }
    }



}
