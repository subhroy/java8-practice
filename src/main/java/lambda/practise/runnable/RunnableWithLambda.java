package lambda.practise.runnable;

public class RunnableWithLambda {
    public static void main(String[] args) {
        Runnable rn = () -> System.out.println("Implementaion Child using Lambda");
        rn.run();

        Thread t = new Thread(rn);
        t.start();
        for(int i = 0;i<5;i++){
            System.out.println("main thread of RunnableWithLambda");
        }
    }
}
