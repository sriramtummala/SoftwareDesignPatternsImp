package AbstractFactoryPattern;

public class DellLaptop implements LaptopFactory {

    private int storageSize;

    public DellLaptop(int storageSize) {
        this.storageSize=storageSize;
    }

    @Override
    public Processor createProcessor() {
        return new DellProcessor();
    }

    @Override
    public Storage createStorage() {
        return new DellStorage(storageSize);
    }
}