package lambda.practise.comparator;

import java.util.TreeSet;

public class SortTreeSetExample {
    public static void main(String[] args) {
        TreeSet<Integer> t = new TreeSet<Integer>();
        t.add(10);
        t.add(2);
        t.add(12);
        t.add(6);
        t.add(21);
        System.out.println("Default sort order =="+t);

        //Using Lambda inside construtor

        TreeSet<Integer> t2 = new TreeSet<Integer>((I1,I2) -> I1>I2?-1:I1<I2?1:0);
        t2.add(9);
        t2.add(1);
        t2.add(11);
        t2.add(8);
        t2.add(15);

        System.out.println("Customized sort order =="+t2);
    }
}
