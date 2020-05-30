package datastructure;

import java.util.Hashtable;

public class HashTable {
    public static void main(String[] args) {

        Hashtable h = new Hashtable();

        h.put("b", "cat");
        h.put("a", "snake");
        h.put("z", "dog");
        h.put("d", "monkey");

        System.out.println(h.size());
        System.out.println(h);

        for (Object key : h.keySet()) {//retreiving the key set
            Object value = h.get(key);//retrieve values
            System.out.println("key:  " + key + ", value: " + value);


        }
    }
}