package isp.OnlineStore;

import java.util.HashSet;
import java.util.Set;

public class LoginSystem
{
    private Set<User> users;
    private OnlineStore store;

    LoginSystem(OnlineStore idk)
    {
        users=new HashSet<>();
        store=idk;
    }

    public void register(String user,String password)
    {
        User x=new User(password,user);
        users.add(x);
    }

    public boolean login(String user,String passsword)
    {
        for(User x:users)
        {
            if(x.getUsername().equals(user) && x.getPassword().equals(passsword))
            {
                System.out.println("You are now logged in!");
                store.addSession(user);
                return true;
            }
        }
        System.out.println("Credentials are wrong!");
        return false;
    }

    public boolean logout(String user)
    {
        for(User x:users)
            if(x.getUsername().equals(user)) {
                System.out.println("You are now logged out!");
                store.removeSession(user);
                return true;
            }
        System.out.println("No such user is logged in!");
        return false;
    }
}
