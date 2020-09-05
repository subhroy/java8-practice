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
    }
}
