package lang.wrpper;

public class AutoboxingMain2 {

    public static void main(String[] args) {

        int value = 9;
        Integer boxedValue = value;

        int unboxedValue = boxedValue;

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);


    }

}
