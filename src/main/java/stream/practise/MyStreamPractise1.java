package stream.practise;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class MyStreamPractise1 {

    public static void main(String[] args) {
        ArrayList<Integer> al = new ArrayList<Integer>();
        al.add(0);
        al.add(10);
        al.add(15);
        al.add(5);
        al.add(20);
        al.add(25);
        System.out.println(al);

        //without stream - find even numbers - JAVA 7
        ArrayList<Integer> evenNoList = new ArrayList<Integer>();
        for(Integer i1 : al){
           if(i1%2 == 0){
               evenNoList.add(i1);
           }
        }
        System.out.println(evenNoList);


        //with stream - find even numbers - JAVA 8 onwards
        List<Integer> evenNoList2 = al.stream().filter(I->I%2==0).collect(Collectors.toList());
        System.out.println(evenNoList2);

        //with stream - double the numbers of original list
        List<Integer> doubleNoList = al.stream().map(I->I*2).collect(Collectors.toList());
        System.out.println(doubleNoList);
    }
}
