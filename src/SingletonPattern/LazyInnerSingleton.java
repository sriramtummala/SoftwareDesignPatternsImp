package SingletonPattern;

public class LazyInnerSingleton {

    /** private constructor to prevent others from instantiating this class */
    private LazyInnerSingleton() {}

    /** This inner class is loaded only after getInstance() is called for the first time. */
    private static class SingletonHelper{
        private static final LazyInnerSingleton INSTANCE = new LazyInnerSingleton();
    }


    public static LazyInnerSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }
}
