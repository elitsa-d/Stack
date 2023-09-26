package com.company;

public class Stack {
    private Node head;

    public Stack() {
        this.head = null;
    }

    public boolean isEmpty() {
        if (this.head == null) {
            return true;
        }

        return false;
    }

    public void push(int value) {
        Node newNode = new Node(value);
        newNode.setNext(this.head);
        this.head = newNode;
    }

    public void pop() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is already empty.");
        }
        this.head = this.head.getNext();
    }

    public int peek() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is already empty.");
        }
        return this.head.getValue();
    }

    public void delete() {
        this.head = null;
    }
}
