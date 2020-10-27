package AbstractFactoryPattern;

public class DellStorage implements Storage {

    private int storageSize;

    public DellStorage(int storageSize) {
        this.storageSize = storageSize;
        System.out.println(storageSize + "GB HDD will be used");
    }

    @Override
    public void getType() {
        System.out.println("HDD");
    }

    @Override
    public String toString() {
        return storageSize + "GB Hard Disk";
    }
}