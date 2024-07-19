package collection.map.test;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DictionaryTest {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("== 단어 입력 단계==");
        String word = "";
        String mean = "";

        Map<String, String> map = new HashMap<>();

        while(true){
            System.out.print("영어 단어를 입력하세요. (종료는 'q') : ");
            word = sc.nextLine();
            if(word.equals("q")){
                break;
            }
            System.out.print("한글 뜻을 입력하세요. : ");
            mean = sc.nextLine();
            map.put(word, mean);
        }

        System.out.println("== 단어 검색 단계==");
        while(true){
            System.out.print("찾을 영어 단어를 입력하세요. (종료는 'q') : ");
            word = sc.nextLine();
            if(word.equals("q")){
                break;
            } else if (!map.containsKey(word)) {
                System.out.println(word+ "은(는) 사전에 없는 단어 입니다.");
            }else{
                System.out.println(word + "의 뜻 : " + map.get(word));
            }
        }


    }


}
