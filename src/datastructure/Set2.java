package datastructure;

import java.util.Iterator;
import java.util.TreeSet;

public class Set2 {

    public static void main(String[] args) {

        //HashSet<String>hs = new HashSet<String>();//unordered
        TreeSet<String> hs = new TreeSet<String>(); //ordered
        hs.add("aj");
        hs.add("bhuiya");
        hs.add("aj");
        hs.add("hassan");
        hs.add("cookie");
        hs.add("cookie");

        System.out.println(hs.contains("aj"));

        Iterator<String> hs2 = hs.iterator();
        while(hs2.hasNext()){
            String data = hs2.next();
            System.out.println(data);
        }

        System.out.println(hs);


    }
}
