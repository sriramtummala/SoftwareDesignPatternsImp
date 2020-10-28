package SingletonPattern;

/**The synchronized keyword added to the getInstance() method prevents race conditions,
 * but it also incurs some performance penalty.*/
public class LazyDoubleCheckedLockingSingleton {

    private static volatile LazyDoubleCheckedLockingSingleton instance;

    /** private constructor to prevent others from instantiating this class */
    private LazyDoubleCheckedLockingSingleton() {}

    /** Lazily initialize the singleton in a synchronized block */
    public static LazyDoubleCheckedLockingSingleton getInstance() {
        if(instance == null) {
            synchronized (LazyDoubleCheckedLockingSingleton.class) {
                // double-check
                if(instance == null) {
                    instance = new LazyDoubleCheckedLockingSingleton();
                }
            }
        }
        return instance;
    }
}
