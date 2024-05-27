package isp.OnlineStore;

import org.junit.Assert;
import org.junit.Test;

import java.util.Comparator;

public class OnlineStore
{
    OnlineStore storetest=new OnlineStore();

    @Test
    public void TestDisplayAll()
    {
        Assert.assertEquals("[Name:Diamonds 100.0$, Name:Zirconia 70.0$, Name:Ruby 90.0$, Name:Sapphire 80.0$]",storetest.getProducts().toString());
    }

    @Test
    public void testDisplayOrderedByPrice()
    {
        Comparator<Product> sortByPrice = Comparator.comparing(Product::getPrice);
        Assert.assertEquals("[Name:Zirconia 70.0$, Name:Sapphire 80.0$, Name:Ruby 90.0$, Name:Diamonds 100.0$]",storetest.getProductsSorted(sortByPrice).toString());

    }

    @Test
    public void equalsTest()
    {
       User x=new User("123","Mirel");
       User y=new User("123","Mirela");
       Assert.assertEquals(false,x.equals(y));
    }

    @Test
    public void equalProduct()
    {
        Product x=new Product("diamond",5.3);
        Product y=new Product("diamond",5.3);
        Assert.assertEquals(true,x.equals(y));
    }
}
