package design.pattern.singleton;

public class LazyInstance {

    private static LazyInstance lzIns;

    private LazyInstance(){
        if(lzIns!=null){
            throw new RuntimeException("Use getInstance method to create instance");
        }
    }

    public static LazyInstance getInstance(){
        if(lzIns == null){
            synchronized (LazyInstance.class){
                if(lzIns==null){
                    lzIns = new LazyInstance();
                }
            }
        }
        return lzIns;
    }
}
