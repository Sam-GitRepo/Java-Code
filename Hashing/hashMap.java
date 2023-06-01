package Hashing;

import java.util.*;

public class hashMap {
    public static void main(String[] args) {
        //country (key), population (value)
        HashMap<String, Integer> map = new HashMap<>();


        //Insertion
        map.put("India", 150);
        map.put("USA", 100);
        map.put("China", 130);

        System.out.println(map);

        map.put("China", 180);
        System.out.println(map);


        //Search
        if(map.containsKey("hina")){
            System.out.println("Present in the map");
        }else{
            System.out.println("Not Present in the map");
        }

        System.out.println(map.get("China"));
        System.out.println(map.get("Pak"));


        //Iteration
        int arr[] = {12,15 ,18, 20};
        for(int i = 0; i <arr.length; i++){
            System.out.print(arr[i]+ " ");
        }
        System.out.println();

        for(int val : arr){
            System.out.print(val + " ");
        }

        for(Map.Entry<String, Integer>e:map.entrySet()){
            System.out.println(e.getKey());
            System.out.println(e.getValue());
        }

        Set<String> keys = map.keySet();
        for(String key : keys){
            System.out.println(key+ " "+map.get(key)) ;
        }


        //remove
        map.remove("China");
        System.out.println(map);


        
    }
}

// It always store data in key value pair
// key are always be unique, pair would be same

// fuel(key)| price(value)
// ------------------
// Cng    | 70
// diesel | 80
// petrol | 90

// maps are unorderd