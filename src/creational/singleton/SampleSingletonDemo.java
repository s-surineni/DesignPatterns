package creational.singleton;

public class SampleSingletonDemo {
    public static void main(String[] args) {
        SampleSingleton singleton = SampleSingleton.getInstance();
        System.out.println(singleton);
        SampleSingleton singleton2 = SampleSingleton.getInstance();
        System.out.println(singleton2);
    }
}
