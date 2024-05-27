package isp.OnlineStore;

import java.util.*;

public class OnlineStore
{
    private List<Product> products;
    private Map<String,ActiveSession> session;

    OnlineStore()
    {
        products=new ArrayList<Product>();
        Product x=new Product("Diamonds",100);
        Product x1=new Product("Zirconia",70);
        Product x2=new Product("Ruby",90);
        Product x3=new Product("Sapphire",80);
        products.add(x);
        products.add(x1);
        products.add(x2);
        products.add(x3);
        session=new HashMap<String,ActiveSession>();
    }

    public List<Product> getProducts()
    {
        return products;
    }

    public List<Product> getProductsSorted(Comparator<Product> sortCriteria)
    {
        List<Product> product=new ArrayList<Product>();
        product=products;
        product.sort(sortCriteria);
        return product;
    }

    void addSession(String username)
    {
        ActiveSession user=new ActiveSession(username);
        session.put(username,user);
    }

    void removeSession(String username)
    {
        ActiveSession user=new ActiveSession(username);
        session.remove(username,user);
    }

    public void addToCart(String user,Product product,int quantity)
    {
        session.get(user).addToCart(product,quantity);
    }

    public String checkout(String user)
    {
        int sum=0;
        Map<Product,Integer> products1=session.get(user).getShoppingCart();
        for(Product i:products1.keySet())
        {
            sum += i.getPrice() * products1.get(i);
        }
        return "User:"+user+"\nCurrent Items:"+session.get(user).getShoppingCart()+"\nTotal:"+sum+"$";
    }

}
