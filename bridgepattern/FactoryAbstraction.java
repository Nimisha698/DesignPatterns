package bridgepattern;

public abstract class FactoryAbstraction {
    public Producer producer1;
    public Producer producer2;
    public FactoryAbstraction(Producer producer1,Producer producer2)
    {
        this.producer1=producer1;
        this.producer2=producer2;
    }
    public abstract void productionCompleted();
}
