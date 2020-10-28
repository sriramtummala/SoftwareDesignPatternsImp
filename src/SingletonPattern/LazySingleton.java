package SingletonPattern;

/** Lazy initialization means delaying the initialization of something until the first time it is needed.*/
public class LazySingleton {
    private static LazySingleton instance;

    /** Don't let anyone else instantiate this class */
    private LazySingleton(){}

    public static synchronized LazySingleton getInstance(){
        if(instance==null){
            instance = new LazySingleton();
        }
        return instance;
    }
}
