package design.pattern.singleton;

public class CallSingleton {
    public static void main(String[] args) {
        System.out.println("early instance :: "+ design.pattern.singleton.EarlyInstance.getInstance());
        System.out.println("lazy instance ::  " + design.pattern.singleton.LazyInstance.getInstance());
    }
}
