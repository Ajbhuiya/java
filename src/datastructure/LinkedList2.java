package datastructure;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedList2 {//sequential order
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<String>();
        list.add("abdul");
        list.add("hassan");
        list.add("cookie");
        list.add("mahade");
        list.remove();
        list.remove();
        System.out.println(list.size());
        list.get(0);

       // System.out.println(list);
       // String name = list.get(0);
       // System.out.println(name);

        Iterator<String> it = list.iterator();
        /*System.out.println(it.next());//prints next element
        System.out.println(it.next());
        System.out.println(it.next());*/
        while (it.hasNext()){
            String fullIt = it.next();
            System.out.println(fullIt);
        }



        }


    }





