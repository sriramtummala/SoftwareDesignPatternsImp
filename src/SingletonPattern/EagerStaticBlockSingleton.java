package SingletonPattern;

/**The advantage with static block initialization is that you can write your initialization logic or handle exceptions in the static block.*/
public class EagerStaticBlockSingleton {

    private static final EagerStaticBlockSingleton instance;

    /** Don't let anyone else instantiate this class */
    private EagerStaticBlockSingleton(){}

    /** Create the one-and-only instance in a static block */
    static {
        try{
            instance = new EagerStaticBlockSingleton();

        } catch(Exception ex) {
            throw ex;
        }
    }

    /** Provide a public method to get the instance that we created */
    public static EagerStaticBlockSingleton getInstance() {
        return instance;
    }

}
