package datastructure;

import java.util.Stack;

public class Stack2 {

    public static void main(String[] args) {
        Stack<Integer> st = new Stack<Integer>();
        st.push(10);
        st.push(20);
        st.push(100);
        st.push(30);
        st.push(5);
        st.push(12);
        st.peek();

        for(Integer st2:st){
            System.out.println(st2);
        }


        System.out.println(st.pop());//removes top and returns it
        //st.pop();//removes last element  which is 12
       // System.out.println(st.peek());Returns the element on the top of the stack, but does not remove it.

        boolean top = st.empty();
        st.push(1);//pushes to beginning
        Object em = st.contains(2);
        System.out.println(em);
        System.out.println(st);//returns last element added
       // System.out.println(top);
    }
}
