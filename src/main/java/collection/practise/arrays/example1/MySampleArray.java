package collection.practise.arrays.example1;

public class MySampleArray {

    public static void main(String[] args) {
        String[] cars = {"Volvo", "BMW", "Ford", "Mazda"};
        int[] myNum = {10, 20, 30, 40};

        System.out.println(cars[0]);

        //foreach loop
        System.out.println(".... with for-each loop.....");
        String[] carsArray = {"Toyota", "Opel", "Tata", "Maruti"};
        for (String i : carsArray) {
            System.out.println(i);
        }
    }
}
