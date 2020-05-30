package datastructure;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        LinkedList<Integer> llist = new LinkedList<Integer>();
        llist.add(1);
        llist.add(2);
        llist.add(3);

        for(int i =0; i<llist.size();i++){
            System.out.println(llist.get(i));
        }
        LinkedList<String> slist = new LinkedList<String>();
        slist.add("bmw");
        slist.add("honda");
        slist.add("kia");
        System.out.println(slist);













    }
    }
   /*     LinkedList<String> llist = new LinkedList<String>();
        llist.add("abdul");
        llist.add("jobbar");
    }
    List<String> nList= new LinkedList<String>();
}
*/