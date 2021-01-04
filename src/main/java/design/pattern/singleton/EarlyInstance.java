package design.pattern.singleton;

public class EarlyInstance {
    private static EarlyInstance earlyIns = new EarlyInstance();

    public static EarlyInstance getInstance(){
        return earlyIns;
    }
}
