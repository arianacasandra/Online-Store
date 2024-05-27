package isp.OnlineStore;

import java.util.HashMap;
import java.util.Map;

public class ActiveSession
{
    private String username;
    private Map<Product,Integer> shoppingCart;

    ActiveSession(String username)
    {
        this.username=username;
        shoppingCart=new HashMap<Product,Integer>();
    }

    public Map<Product,Integer> getShoppingCart()
    {
        return shoppingCart;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void addToCart(Product product,int quantity)
    {
        shoppingCart.put(product,quantity);
    }
}
