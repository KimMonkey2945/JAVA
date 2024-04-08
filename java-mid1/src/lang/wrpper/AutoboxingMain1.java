package lang.wrpper;

public class AutoboxingMain1 {

    public static void main(String[] args) {

        int value = 8;
        Integer boxedValue = Integer.valueOf(value);

        int unboxedValue = boxedValue.intValue();

        System.out.println("boxedValue = " + boxedValue);
        System.out.println("unboxedValue = " + unboxedValue);

    }

}
