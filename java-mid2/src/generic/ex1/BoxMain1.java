package generic.ex1;

public class BoxMain1 {

    public static void main(String[] args) {

        IntegerBox integerBox = new IntegerBox();
        integerBox.set(24);
        Integer integer = integerBox.get();
        System.out.println("integer = " + integer);

        StringBox stringBox = new StringBox();
        stringBox.set("김주하");
        String str = stringBox.get();
        System.out.println("str = " + str);


    }


}
