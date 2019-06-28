package adapterdesignpattern;
public class AnimalAdapter implements BirdInterface
{
    private Lion lion;
    AnimalAdapter(Lion lion)
    {
        this.lion=lion;
    }
    public void chirp()
    {
        lion.makeSound();
    }
}