package AdapterPackage;

import AdapterPackage.AnimalInterface;

public class Lion implements AnimalInterface
{
    public void walk()
    {
        System.out.println("walk");
    }
    public void makeSound()
    {
        System.out.println("roars");
    }
}