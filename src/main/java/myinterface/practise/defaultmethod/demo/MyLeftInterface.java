package myinterface.practise.defaultmethod.demo;

public interface MyLeftInterface {
    default void m1(){
        System.out.println("left interface");
    }
}
