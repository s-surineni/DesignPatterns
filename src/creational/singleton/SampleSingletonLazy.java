package creational.singleton;

public class SampleSingletonLazy {
    private static SampleSingletonLazy instance = null;

    private SampleSingletonLazy() {
    }

    public static SampleSingletonLazy getInstance() {
        if (instance == null) {
            instance = new SampleSingletonLazy();
        }
        return instance;
    }
}
