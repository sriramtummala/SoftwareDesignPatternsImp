package AbstractFactoryPattern;

public class DellProcessor implements Processor {

    private String storage;

    public DellProcessor() {
        System.out.println("AMD Processor will be used for Dell Laptop");
    }

    // This method will attach Storage Object with Processor
    @Override
    public void attachStorage(Storage storage) {
        this.storage = storage.toString();
        System.out.println(storage + " is attached to Dell Laptop");
    }

    @Override
    public void printSpecs() {
        System.out.println(this.toString());
    }

    @Override
    public String toString() {
        return "DellProcessor is created using AMD Processor and " + this.storage;
    }
}
