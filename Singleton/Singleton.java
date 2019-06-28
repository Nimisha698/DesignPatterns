package Singleton;

import java.util.*;
class Singleton
{
    String s;
    private static Singleton single=null;
    private Singleton()
    {
        s="String of Singleton class";
    }
    public static Singleton getInstance()
    {
        if(single==null)
            return single=new Singleton();
        return single;
    }
}
