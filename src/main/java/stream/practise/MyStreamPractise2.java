package stream.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamPractise2 {

    public static void main(String[] args) {
        ArrayList<String> nameList = new ArrayList<String>();
        nameList.add("subhasis");
        nameList.add("bivash");
        nameList.add("Durgaprasad");
        nameList.add("kamesh");
        nameList.add("vittal");
        nameList.add("rajithravindran");
        System.out.println(nameList);

        List resultLst = nameList.stream().filter(s -> s.length()>6).collect(Collectors.toList());
        System.out.println(resultLst);

        List resultLst2 = nameList.stream().map(s -> s.length()).collect(Collectors.toList());
        System.out.println(resultLst2);

        List resultLst3 = nameList.stream().map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(resultLst3);

        long noOfTotalStreamElement = nameList.stream().count();
        System.out.println(noOfTotalStreamElement);

        long noOfElement7 = nameList.stream().filter(s->s.length()>6).count();
        System.out.println(noOfElement7);


        ArrayList<Integer> numberList = new ArrayList<Integer>();
        numberList.add(15);
        numberList.add(5);
        numberList.add(25);
        numberList.add(10);
        numberList.add(20);
        System.out.println(numberList);

        //Default sorting by sorted() method of Stream
        List<Integer> sortedLst = numberList.stream().sorted().collect(Collectors.toList());
        System.out.println(sortedLst);

        //Custom sorting by Stream
        List<Integer> customSortedLst = numberList.stream().sorted((i1,i2)-> -i1.compareTo(i2)).collect(Collectors.toList());
        System.out.println(customSortedLst);


        //Find min and max value inside Stream
        Integer minValue = numberList.stream().min((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(minValue);

        Integer maxValue = numberList.stream().max((i1,i2)->i1.compareTo(i2)).get();
        System.out.println(maxValue);

        //forEach of Stream
        nameList.stream().forEach(s -> System.out.println(s));

        System.out.println("\n -----try printing using method reference ---- \n");
        //forEach of Stream using method reference
        nameList.stream().forEach(System.out::println);
    }
}
