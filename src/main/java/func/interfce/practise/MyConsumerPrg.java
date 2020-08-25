package func.interfce.practise;

import java.util.function.Consumer;

public class MyConsumerPrg {
    public static void main(String[] args) {
        Consumer<String> cIntf = str -> System.out.println(str);
        cIntf.accept("hello.");

    }
}
