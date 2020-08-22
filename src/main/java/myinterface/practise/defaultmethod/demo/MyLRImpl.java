package myinterface.practise.defaultmethod.demo;

public class MyLRImpl implements MyLeftInterface,MyRightInterface{


    public static void main(String[] args) {
        MyLRImpl myImpl = new MyLRImpl();
        myImpl.m1();

    }

    /**
     * Multiple inheritance with same default method in multiple interfaces
     * when we call the parent method implementation without overriding it.
     * */
    @Override
    public void m1() {
        //System.out.println("My own impl...");
        MyLeftInterface.super.m1();
        MyRightInterface.super.m1();
    }
}
