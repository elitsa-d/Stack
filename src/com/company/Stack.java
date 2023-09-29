package com.company;

public class Stack {
    private Node head;
    private int size;

    public Stack() {
        this.head = null;
        this.size = 0;
    }

    public int getSize() {
        return this.size;
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
        this.size++;
    }

    public void pop() {
        if (this.isEmpty()) {
            throw new IndexOutOfBoundsException("The stack is already empty.");
        }
        this.head = this.head.getNext();
        this.size--;
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
