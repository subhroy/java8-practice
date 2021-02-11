package collection.practise.map;

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {

    public static void main(String[] args) {
        Map<Integer,String> hMap = new HashMap<Integer,String>();

        hMap.put(1, "google.com");
        hMap.put(2, "alphabet.com");
        hMap.put(3, "amazon.com");
        hMap.put(1, "wallmart.com");

        for(Map.Entry entryObj : hMap.entrySet()){
            System.out.println(entryObj.getKey() + " .... " + entryObj.getValue());
        }

    }
}
