package singleton;
import java.util.*;
class Singleton
{
    String string;
    private static Singleton single=null;
    private Singleton()
    {
        string="String of Singleton class";
    }
    public static Singleton getInstance()
    {
        if(single==null)
            return single=new Singleton();
        return single;
    }
}