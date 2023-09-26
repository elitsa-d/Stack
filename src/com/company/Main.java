package com.company;

public class Main {

    public static void main(String[] args) {
        Stack stack = new Stack();
        stack.push(10);
        stack.push(4);
        stack.push(7);
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
        System.out.println(stack.peek());

        stack.pop();
        stack.pop();
    }
}
