package datastructure;

import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        //stack of dishes
        //putting a dish in top is pusjing
        //off stack is pop
        Stack<String> stack = new Stack<String>();
        stack.push("bottom");
        System.out.println(stack);
        stack.pop();


    }
}