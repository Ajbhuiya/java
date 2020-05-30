package datastructure;

import java.util.LinkedList;
import java.util.Queue;

public class QueDemo {

    public static void main(String[] args) {

        Queue <String> myQue = new LinkedList<String>();
        myQue.add("aj");
        myQue.add("hassan");
        myQue.add("ccokie");
        //myQue.poll();//removes top element
        System.out.println(myQue.peek());//returns top element
        System.out.println(myQue.size());



       for(String newQ:myQue)
        System.out.println(newQ);
        }
        }

