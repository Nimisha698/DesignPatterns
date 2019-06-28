package AdapterPackage;

import AdapterPackage.BirdInterface;

public class Bird implements BirdInterface
{
    public void chirp()
    {
        System.out.println("chirps");
    }
}
