package adapterdesignpattern;
public class Main {
    public static void main(String args[])
    {
        Lion l = new Lion();
        l.walk();
        l.makeSound();
        BirdInterface birdObj = new AnimalAdapter(l);
        birdObj.chirp();
    }
}