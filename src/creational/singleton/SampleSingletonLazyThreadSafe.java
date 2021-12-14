package creational.singleton;

public class SampleSingletonLazyThreadSafe {
    private static volatile SampleSingletonLazyThreadSafe instance = null;

    private SampleSingletonLazyThreadSafe() {
//        Protects from reflection?
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    public static SampleSingletonLazyThreadSafe getInstance() {
        if (instance == null) {
            synchronized (SampleSingletonLazyThreadSafe.class) {
                if (instance == null) {
                    instance = new SampleSingletonLazyThreadSafe();
                }
            }
        }
        return instance;
    }
}
