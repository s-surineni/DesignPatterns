package creational.singleton;

public class SampleSingletonLazyThreadSafeDemo {
    public static void main(String[] args) {
        SampleSingletonLazyThreadSafe singleton = SampleSingletonLazyThreadSafe.getInstance();
        System.out.println(singleton);
        SampleSingletonLazyThreadSafe singleton2 = SampleSingletonLazyThreadSafe.getInstance();
        System.out.println(singleton2);
    }
}
