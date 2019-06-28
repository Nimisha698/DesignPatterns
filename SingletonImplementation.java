package singletonpackage;

import java.util.*;
class SingletonImplementation
{
    public static void main(String args[])
    {
        Singleton instance1=Singleton.getInstance();
        Singleton instance2=Singleton.getInstance();
        instance1.string="Changing the string";
        System.out.println(instance1.string);
        System.out.println(instance1.string);
    }
}
