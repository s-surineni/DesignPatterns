package creational.singleton;

public class SampleSingletonLazyDemo {
    public static void main(String[] args) {
        SampleSingletonLazy singleton = SampleSingletonLazy.getInstance();
        System.out.println(singleton);
        SampleSingletonLazy singleton2 = SampleSingletonLazy.getInstance();
        System.out.println(singleton2);
    }
}
