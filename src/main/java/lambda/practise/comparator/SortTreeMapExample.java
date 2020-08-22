package lambda.practise.comparator;

import java.util.TreeMap;

public class SortTreeMapExample {
    public static void main(String[] args) {
        TreeMap<Integer,String> tmap = new TreeMap<Integer, String>();
        tmap.put(100,"subh");
        tmap.put(600,"vit");
        tmap.put(300,"geo");
        tmap.put(500,"kapil");
        tmap.put(200,"prachi");
        tmap.put(400,"rajith");
        System.out.println(tmap);

        TreeMap<Integer,String> tmap1 = new TreeMap<Integer, String>((I1,I2) -> I1>I2?-1:I1<I2?1:0);
        tmap1.put(100,"subh");
        tmap1.put(600,"vit");
        tmap1.put(300,"geo");
        tmap1.put(500,"kapil");
        tmap1.put(200,"prachi");
        tmap1.put(400,"rajith");
        System.out.println(tmap1);
    }
}
