package Hashing;

import java.util.*;

public class ValidAnagram {

    static HashMap<Character, Integer> freqmap(String str) {
        HashMap<Character, Integer> mp = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            Character ch = str.charAt(i);
            if (!mp.containsKey(ch)) {
                mp.put(ch, 1);
            } else {
                int currfreq = mp.get(ch);
                mp.put(ch, currfreq + 1);
            }
        }
        return mp;
    }

    public boolean isAngaram(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp1 = freqmap(s);
        HashMap<Character, Integer> mp2 = freqmap(t);

        return mp1.equals(mp2);
    }


    //Approach 2
    
    public boolean isAngaram2(String s, String t) {
        if (s.length() != t.length())
            return false;
        HashMap<Character, Integer> mp = freqmap(s);
        for (int i = 0; i < t.length(); i++) {
            Character ch = t.charAt(i);
            if (!mp.containsKey(ch))
                return false;
            int currfreq = mp.get(ch);
            mp.put(ch, currfreq - 1);
        }

        for (int i : mp.values()) {
            if (i != 0)
                return false;
        }
        return true;
    }
}
