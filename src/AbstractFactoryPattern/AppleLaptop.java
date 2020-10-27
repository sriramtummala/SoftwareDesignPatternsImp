package AbstractFactoryPattern;

public class AppleLaptop implements LaptopFactory {

    private int storageSize;

    public AppleLaptop(int storageSize) {
        this.storageSize = storageSize;
    }

    @Override
    public Processor createProcessor() {
        return new AppleProcessor();
    }

    @Override
    public Storage createStorage() {
        return new AppleStorage(storageSize);
    }
}
