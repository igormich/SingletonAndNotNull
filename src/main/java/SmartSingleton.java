public class SmartSingleton {
    private static volatile SmartSingleton instance;

    private SmartSingleton() {

    }

    public static SmartSingleton getInstance() {
        if (instance == null) {
            synchronized (SmartSingleton.class) {
                if (instance == null) {
                    instance = new SmartSingleton();
                }
            }
        }
        return instance;
    }
}
