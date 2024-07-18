package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class ArrayToMapTest {

    public static void main(String[] args) {
    String[][] productArr =  {{"Java", "10000"}, {"Spring", "20000"}, {"JPA", "30000"}};

    Map<String, Integer> map = new HashMap<>();

    for(String[] a : productArr){
        map.put(a[0], Integer.parseInt(a[1]));
    }

    for(Map.Entry<String, Integer> a : map.entrySet()){
        System.out.println("제품 : " + a.getKey() + ", 가격 : " + a.getValue() );
    }

    }


}
