package AbstractFactoryPattern;

public interface LaptopFactory {

    Processor createProcessor();
    Storage createStorage();

}