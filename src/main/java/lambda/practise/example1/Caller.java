package lambda.practise.example1;

public class Caller {
    public static void main(String[] args) {
        SampleInterface simplObj = () -> System.out.println("My first lambda example..");
        simplObj.method1();
    }
}
