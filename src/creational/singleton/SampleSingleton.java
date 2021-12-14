package creational.singleton;

public class SampleSingleton {
    private static SampleSingleton instance = new SampleSingleton();

    private SampleSingleton() {
    }

    public static SampleSingleton getInstance() {
        return instance;
    }
}
