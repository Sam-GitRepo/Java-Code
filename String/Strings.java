package String;

import java.util.*;
public class Strings {
    public static void main(String[] args) {
        // Scanner in = new Scanner(System.in);
        // String name = in.nextLine();
        // System.out.println(name);

        //concatenation
        String firstName = "Hello";
        String lastName = "world";
        String fullName = firstName + " " +lastName;

        //length
        System.out.println(fullName.length());

        //charAt
        for(int i = 0; i < fullName.length();i++){
            System.out.println(fullName.charAt(i));
        }

        //compare
        String name1 = "Sam";
        String name2 = "Sam";

        // s1 > s2 : +ve value
        // s1 == s2 : 0
        //s1 < s2 : -ve value

        if(name1.compareTo(name2) == 0){
            System.out.println("Strings are equal");
        }else{
            System.out.println("Strings are not equal");
        }

        // subString
        String words = "Hello Bitch how are you";
        String name = words.substring(6, words.length());
        System.out.println(name);

        //String are immutable

    }
}
