package lambda.practise.comparator;

import java.util.ArrayList;
import java.util.Collections;

public class SortArrayListComparator {

    public static void main(String[] args) {
        ArrayList al = new ArrayList();
        al.add(10);
        al.add(8);
        al.add(12);
        al.add(7);
        al.add(21);
        System.out.println("before sort : "+al);
        Collections.sort(al);
        System.out.println("after sort : "+al);

        //Sorting with comparator
        Collections.sort(al, new MyComparator());

        System.out.println("after sort using comparator: "+al);
    }
}
