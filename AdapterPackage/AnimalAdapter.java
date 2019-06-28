package AdapterPackage;

public class AnimalAdapter implements BirdInterface
{
    Lion lion;
    AnimalAdapter(Lion lion)
    {
        this.lion=lion;
    }
    public void chirp()
    {
        lion.makeSound();
    }
}