package enumeration.ex03;

import java.util.Arrays;

public class EnumMethodMain {

    public static void main(String[] args) {

        Grade [] values = Grade.values();
        System.out.println("values : " + Arrays.toString(values));

        for(Grade g : values){
            System.out.println("name : " + g.name() + ", ordinal :" + g.ordinal());
        }

        String input = "GOLD";
        Grade gold = Grade.valueOf(input);
        System.out.println("gold : " + gold);


    }
}
