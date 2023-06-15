package Hashing;

import java.util.*;

public class ValidAnagram {
    public static void main(String[] args) {
        // HashMap<Character, Integer> map = new HashMap<>();
    }

    static HashMap<Character, Integer> freqmap (String str){
        HashMap>Character, Integer> mp = new HashMap<>();
        for(int i = 0 ; i < str.length(); i++){
            Character ch = str.charAt(i);
        }
        return mp;
    }

    public boolean isAngaram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> mp1 = freqmap(s);
        HashMap<Character, Integer> mp2 = freqmap(t);

        return mp1.equals(mp2);


        
    }
}
