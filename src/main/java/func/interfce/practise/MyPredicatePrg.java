package func.interfce.practise;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Collection;
import java.util.function.Predicate;

public class MyPredicatePrg {

    public static void main(String[] args) {
        Predicate<Integer> pObj1 = (I) -> I>20;
        System.out.println(pObj1.test(12));

        Predicate<String> pObj2 = (mystr) -> mystr.equalsIgnoreCase("subh");
        System.out.println(pObj2.test("subh"));

        Predicate<String> pObj3 = (mystr2) -> mystr2.length()>6;
        System.out.println(pObj3.test("subh"));


        Predicate<Collection> pObj4 = (c) -> c.isEmpty();
        ArrayList al = new ArrayList();
        //al.add(1);
        System.out.println(pObj4.test(al));

    }
}
