package collection.map.test;

import java.util.HashMap;
import java.util.Map;

public class Cart {

    private Map<Product, Integer> cartMap = new HashMap<>();

    public void add(Product product, Integer quantity){
        int exquantity = cartMap.getOrDefault(product, 0);
        cartMap.put(product, quantity + exquantity);
    }

    public void printAll(){
        System.out.println("=== 모든상품출력 ===");
        for(Map.Entry<Product, Integer> map : cartMap.entrySet()){
            System.out.println("상품 : " + map.getKey().toString() + " 수량 : " + map.getValue());
        }
    }

    public void minus(Product product, Integer quantity){
        int exquantity = cartMap.get(product) - quantity;
        if(exquantity <= 0){
            cartMap.remove(product);
        }else{
            cartMap.put(product, exquantity - quantity);
        }
    }


}
