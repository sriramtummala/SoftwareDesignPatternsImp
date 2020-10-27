package AbstractFactoryPattern;

public class AppleProcessor implements Processor {

    private String storage;

    public AppleProcessor() {
        System.out.println("Intel Processor will be used for Apple Laptop");
    }

    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage.toString();
        System.out.println(storage + " is attached to Apple Laptop");

    }

    @Override
    public void printSpecs() {
        System.out.println(this.toString());

    }

    @Override
    public String toString() {
        return "AppleProcessor is created using Intel Processor and "+this.storage;
    }

}
