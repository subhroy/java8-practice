package lambda.practise.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayListWithLambda {
    public static void main(String[] args) {
        ArrayList<Integer> l = new ArrayList<Integer>();
        l.add(10);
        l.add(8);
        l.add(12);
        l.add(7);
        l.add(21);
        System.out.println("before sort.. : "+l);
        Collections.sort(l,(a,b)->(a<b)?1:(a>b)?-1:0);
        System.out.println("before sort with lambda.. : "+l);
    }
}
