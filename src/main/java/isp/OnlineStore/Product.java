package isp.OnlineStore;

public class Product
{
    private String name;
    private double price;

    Product(String name,double price)
    {
        this.name=name;
        this.price=price;
    }

    public String getName() {
        return name;
    }

    public double getPrice() {
        return price;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj)
            return true;
        if(obj!=null && obj instanceof Product)
        {
            Product x=(Product) obj;
            if(this.name.equals(x.name))
                return true;
        }
        return false;
    }

    public int hashCode()
    {
        return 7*this.name.hashCode()+7*(int)this.price+31;
    }

    public String toString()
    {
        return "Name:"+name+" "+price+"$";
    }
}
