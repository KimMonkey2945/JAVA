package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ItemPriceTest {

    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("사과", 500);
        map.put("바나나", 500);
        map.put("망고", 1000);
        map.put("딸기", 1000);

        for(Map.Entry<String, Integer> m : map.entrySet()){
            if(m.getValue().equals(1000)){
                System.out.print(m.getKey() + " ");
            }
        }

    }

}
