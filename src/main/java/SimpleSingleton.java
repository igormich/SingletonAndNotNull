public class SimpleSingleton {
    private static volatile SimpleSingleton instance = new SimpleSingleton();

    private SimpleSingleton() {

    }

    public static SimpleSingleton getInstance() {
        return instance;
    }
}
