package SingletonPattern;

public class EagerSingleton {

    /** private constructor to prevent others from instantiating this class */
    private EagerSingleton()
    {

    }

    /** Create an instance of the class at the time of class loading */
    private static final EagerSingleton instance = new EagerSingleton();

    /** Provide a global point of access to the instance */
    private static EagerSingleton getInstance(){
        return instance;
    }
}
