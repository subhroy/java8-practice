package func.interfce.practise;

import java.util.function.Function;

public class MyFunctionalPrg {
    public static void main(String[] args) {
        Function<String, Integer> fIntf = s -> s.length();
        int length = fIntf.apply("subhasis");
        System.out.println(length);


        Function<Integer, Integer> fIntf2 = i -> i*i;
        int result = fIntf2.apply(5);
        System.out.println(result);
    }

}
