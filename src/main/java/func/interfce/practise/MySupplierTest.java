package func.interfce.practise;


import java.util.Date;
import java.util.function.Supplier;

public class MySupplierTest {
    public static void main(String[] args) {

        //getting date
        Supplier<Date> supIntf = () -> new Date();
        System.out.println(supIntf.get());
    }
}
