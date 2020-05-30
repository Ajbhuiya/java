package datastructure;

import java.util.HashMap;
import java.util.Map;

public class MapDemo {
    public static void main(String[] args) {
       Map<Integer, String> map = new HashMap<Integer, String>();
        map.put(1, "abdul");
        map.put(1, "bhuiya");
        map.put(2, "hassan");
        map.put(3, "cookie");
        map.remove(1);

        for(Map.Entry<Integer,String> newMap:map.entrySet()){
            int key = newMap.getKey();
            String value = newMap.getValue();
            System.out.println(newMap);


       }







        /*for(Map.Entry<Integer,String> item : map.entrySet()){
            int key = item.getKey();
            String str =item.getValue();
            System.out.println(item);*/
        }



/*
        //to get a value
        String value = map.get(1);
        System.out.println(value);*/



       /* for (Map.Entry<Integer, String> item : map.entrySet()) {
            int key = item.getKey();
            String value1 = item.getValue();
            System.out.println("key " + key + " value is " + value1);*/

        }

       /* Map<Integer, String> map1 = new TreeMap<Integer, String>();
        map1.put(1, "abdul");
        map1.put(1, "bhuiya");
        map1.put(2,"hassan");
        map1.put(3, "cookie");

        //to get a value
        String map2 = map1.get(1);
        System.out.println(map2);
        for(Map.Entry<Integer, String> item :map1.entrySet()){
            int key = item.getKey();
            String value = item.getValue();
            System.out.println(" key " + key + " value is " + value);
        }
*/
        /*//to print maps
        for(Map.Entry<Integer, String> item1 : map.entrySet() ){
        System.out.println(item1);}*/



