package doublecolon.operator.practise.method.reference;

public class MethodReferencePrg {

    public static void m2(){
        System.out.println("Implemeted by method reference...static ");
    }

    public void m3(){
        System.out.println("Implemeted by method reference...non static ");
    }

    public static void main(String[] args) {
        //Syntax for static method reference
        MyInterface mi =  MethodReferencePrg::m2;
        mi.method1();

        //Syntax for static method reference
        MyInterface mi2 =  new MethodReferencePrg()::m3;
        mi2.method1();
    }
}
