package Hashing;

import java.util.*;

public class hashingBasic {
    public static void main(String[] args) {
        HashMap<String, Integer> names = new HashMap<>();

        names.put("Sam", 24);
        names.put("Sharma", 23);
        names.put("Verma", 25);
        names.put("Jha", 21);
        names.put("Raja", 22);

        System.out.println(names.get("Jha"));

        names.put("Raja", 23);
        System.out.println(names.get("Raja"));

        System.out.println(names.remove("Sam"));
        System.out.println(names.remove("rachna"));

        System.out.println(names.containsKey("Sharma"));
        System.out.println(names.containsKey("Rajjo"));

        names.putIfAbsent("Rajjo", 24);
        names.putIfAbsent("Sam", 23);

        System.out.println(names.keySet());
        System.out.println(names.values());
        System.out.println(names.entrySet());

        for (String key : names.keySet()) {
            System.out.printf("Age of %s is %d \n", key, names.get(key));
        }

        System.out.println();

        for (Map.Entry<String, Integer> n : names.entrySet()) {
            System.out.printf("Age of  %s is %d \n", n.getKey(), n.getValue());
        }

    }
}
