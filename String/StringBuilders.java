package String;

// import java.util.*;
public class StringBuilders {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Sam");
        System.out.println(sb);

        //char at index
        System.out.println(sb.charAt(1));

        //set char at index
        sb.setCharAt(1, 'u');
        System.out.println(sb);

        //insert in string
        sb.insert(0, 'M');
        System.out.println(sb);

        //delete in string
        sb.delete(0, 1);
        System.out.println(sb);

        //append (add in same string without creating new variable )
        sb.append(' ');
        sb.append('H');
        sb.append('R');
        sb.append('I');
        sb.append('T');
        sb.append('I');
        sb.append('K');
        System.out.println(sb);
        System.out.println(sb.length());

    }
}
