package Basic;
import java.util.Scanner;

public class FunctionString {
    public static void main(String[] args) {
        // String sandesh = naam();
        // System.out.println(sandesh);

        System.out.println("enter your name");
        Scanner in = new Scanner(System.in);
        String k = in.next();
        String daak = name(k);
        System.out.println(daak);

    }

    // static String naam() {
    // String word = "Hey wasupp";
    // return word;
    // }

    static String name(String a) {
        String msg = "Hello Mr. " + a;
        return msg;
    }

}
