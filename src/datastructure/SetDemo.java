package datastructure;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetDemo {
    public static void main(String[] args) {

        Set<String> hSet = new HashSet<String>();//maintains no order
        hSet.add("Lebron");
        hSet.add("Curry");
        hSet.add("Durant");


        for(String set :hSet){
            System.out.println(set);
        }

        Set<String> lSet = new LinkedHashSet<String>();
        lSet.add("abdul");
        lSet.add("m");
        lSet.add("hassan");
        lSet.add("cookie");
        lSet.add("m");

        for(String set :lSet){
            System.out.println(set);
        }
        Set<String> tSet = new TreeSet<String>();
        tSet.add("mafi");
        tSet.add("fahim");
        tSet.add("mahmud");
        tSet.add("mahmud");

        for(String set :tSet){
            System.out.println(set);
        }



    }

}


    /*















        //from video
        // HashSet - Does not maintain order
        Set<String> set = new HashSet<String>();

        set.add("BMW");
        set.add("Audi");
        set.add("Honda");
        set.add("Honda");

        // System.out.println(set);
        System.out.println("Hash");
        for (String item : set) {
            System.out.println(item);
        }

        // LinkedHashSet - It maintains the order in which the elements are added
        Set<String> lHSet = new LinkedHashSet<String>();
        lHSet.add("BMW");
        lHSet.add("Audi");
        lHSet.add("Honda");
        System.out.println("Linked");
        for (String item : lHSet) {
            System.out.println(item);
        }
        Set<String> tset = new TreeSet<String>();
        tset.add("nissan");
        tset.add("zero");

        for(String pset:tset){
            System.out.println(pset);
        }

    }


}
*/