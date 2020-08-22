package myinterface.practise.defaultmethod.demo;

public class MyImplementation implements MyInterface {
    public static void main(String[] args) {
        MyImplementation myImpl = new MyImplementation();
        myImpl.method1();
        new MyImplementation().method1();
    }

    @Override
    public void method1() {
        System.out.println("child overriding");
    }
}
