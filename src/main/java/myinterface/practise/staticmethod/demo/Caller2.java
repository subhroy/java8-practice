package myinterface.practise.staticmethod.demo;


public class Caller2 implements  MyInterface2 {
    public static void main(String[] args) {
        //Calling the interface static method by only with Interface method
        // It is not possible to call in other way
        MyInterface2.myMethod1();
    }
}
