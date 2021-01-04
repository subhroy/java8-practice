package stream.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class MyStreamPractise2 {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("subhasis");
        nameList.add("bivash");
        nameList.add("Durgaprasad");
        nameList.add("kamesh");
        nameList.add("vittal");
        nameList.add("rajithravindran");
        System.out.println("Original nameList : "+ nameList);

        List resultLst = nameList.stream().filter(s -> s.length()>7).collect(Collectors.toList());
        System.out.println("resultLst(length > 7) : "+resultLst);

        List resultLst2 = nameList.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println("Print Length of each name in nameList : "+resultLst2);

        List resultLst3 = nameList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println("List with Upper Case change : "+resultLst3);

        long noOfTotalStreamElement = nameList.stream().count();
        System.out.println("Total No of element in nameList : "+noOfTotalStreamElement);

        long noOfElement7 = nameList.stream().filter(s->s.length()>6).count();
        System.out.println("Total No of element( > 7) in nameList : " + noOfElement7);


        System.out.println("\n\n//////// ANOTHER EXAMPLE /////////////\n\n");
        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(15);
        numberList.add(5);
        numberList.add(25);
        numberList.add(10);
        numberList.add(20);
        System.out.println("Original numberList : " + numberList);

        //Default sorting by sorted() method of Stream
        List<Integer> sortedLst = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println("Sorted(Default) numberList : " + sortedLst);

        //Custom sorting by Stream
        List<Integer> customSortedLst = numberList.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println("Sorted(Custom) numberList : " + customSortedLst);


        //Find min and max value inside Stream
        Integer minValue = numberList.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("minValue in numberList : " + minValue);

        Integer maxValue = numberList.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println("maxValue in numberList : " + maxValue);

        //forEach of Stream
        nameList.stream().forEach(s -> System.out.println(s));

        System.out.println("\n -----Try printing using Method Reference ---- \n");

        //forEach of Stream using method reference
        nameList.stream().forEach(System.out::println);


        //toArray method of Stream
        Integer[] arr = numberList.stream().toArray(Integer[] ::new);
        for(Integer x : arr){
            System.out.println(x);
        }


        //Stream.of on Group of values.
        Stream<Integer> st =Stream.of(3,33,333,3333,33333); // creating the stream object here..
        //now you can call any method of stream on this
        System.out.println("Print each element");
        st.forEach(System.out::println);


        //Creating a double array and convert it to stream and using that stream
        Double[] myArr = {10.1,10.2,10.3,10.4,10.5};
        System.out.println("Print each element from a Double Array");
        Stream<Double> myStream = Stream.of(myArr);
        myStream.forEach(System.out::println);

    }
}
