package collection.map.test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class WordFrequencyTest1 {

    public static void main(String[] args) {
        String text = "orange banana apple apple banana apple";

        Map<String, Integer> map = new HashMap<>();

        for(String a : text.split(" ")){
            if(map.containsKey(a)){
                map.put(a, ((map.get(a)) + 1));
            }else{
                map.put(a, 1);
            }
        }

        for(Map.Entry<String, Integer> result : map.entrySet()){
            System.out.print(result.getKey() + " : " + result.getValue() + " ");
        }



    }

}
