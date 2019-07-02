package bridgepattern;

public class ChocolateFactory extends FactoryAbstraction{
    public ChocolateFactory(Producer producer1,Producer producer2)
    {
        super(producer1,producer2);
    }
    public void productionCompleted()
    {
        System.out.print("Goods for chocolte factory have been ");
        producer1.job();
        producer2.job();
    }
}
