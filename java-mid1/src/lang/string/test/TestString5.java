package lang.string.test;

public class TestString5 {

    public static void main(String[] args) {
        String str = "hello.txt";
        String ext = ".txt";

        int dot = str.indexOf(ext);
        System.out.println("filename : " + str.substring(0,dot));
        System.out.println("extName : " + ext);
    }

}
