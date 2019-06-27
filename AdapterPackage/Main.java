package AdapterPackage;

import AdapterPackage.AnimalAdapter;
import AdapterPackage.BirdInterface;
import AdapterPackage.Lion;

class Main {
    public static void main(String args[])
    {
        Lion l = new Lion();
        l.walk();
        l.makeSound();
        BirdInterface birdObj = new AnimalAdapter(l);
        birdObj.chirp();
    }
}