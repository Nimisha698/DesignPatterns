package bridgepattern;

public class Main {
    public static void main(String args[])
    {
        FactoryAbstraction factory=new ChocolateFactory(new Manufacturer(),new Supplier());
        factory.productionCompleted();

    }
}
