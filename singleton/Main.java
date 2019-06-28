package singleton;
import java.util.*;
class SingletonImplementation
{
    public static void main(String args[])
    {
        Singleton x=Singleton.getInstance();
        Singleton y=Singleton.getInstance();
        x.s="Hi";
        System.out.println(x.s);
        System.out.println(y.s);
    }
}