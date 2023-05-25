package Hashing;

import java.util.*;

public class hashSet {
    public static void main(String[] args) {
        // creating
        HashSet<Integer> set = new HashSet<>();

        //insert
        set.add(1);
        set.add(2);
        set.add(3);
        set.add(2);
        set.add(1);

        //Size
        System.out.println("size of the set - "+ set.size());

        //print all elements
        System.out.println(set);

        //Search - contains
        if(set.contains(1)){
            System.out.println("set contains 1");
        }
        if(!set.contains(6)){
            System.out.println("does not contain");
        }

        //Delete
        set.remove(1);
        if(!set.contains(1)){
            System.out.println("Does not contain 1");
        }

        //Iterator
        Iterator it = set.iterator();
        //hasNext, next

        while(it.hasNext()){
            System.out.println("loop "+it.next());
        }






       
        

    }

}

// It doesn't allow to duplicate the data & it get always unique element
// insert/add - O(1)
// search/ contains - O(1)
// delete/ remove - O(1)