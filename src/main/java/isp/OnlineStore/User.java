package isp.OnlineStore;

public class User
{
    private String username;
    private String password;

    public User(String password,String username) {
        this.password = password;
        this.username=username;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public boolean equals(Object obj)
    {
        if(this==obj )
            return true;
        if(obj!=null && obj instanceof User)
        {
            User x=(User)obj;
            if(x.username.equals(username))
                return true;
        }
        return false;
    }
    @Override
    public int hashCode()
    {
        return this.username.hashCode()*7+this.password.hashCode()*7+31;
    }
}
