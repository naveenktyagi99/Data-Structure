package com.datastructure.stack;

import com.datastructure.model.Node;

public class Stack {

    private Node head;

    public void push(int element) {
        Node node = new Node(element, null);
        if (head == null) {
            head = node;
            return;
        }
        node.setNext(head);
        head = node;
    }

    public int pop() {
        if (head == null)
            return -1;
        int data = head.getData();
        head = head.getNext();
        return data;
    }

    public Node getHead() {
        return head;
    }

    public void print(Stack stack) {
        Node iterator = stack.getHead();
        while (iterator != null) {
            System.out.print(iterator.getData() + "-- >");
            iterator = iterator.getNext();
        }
    }

    public boolean isEmpty(){
        if(this.getHead()==null)
            return true;
        return false;
    }

    public static void main(String arr[]) {

        Stack stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);

        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.pop();
        stack.print(stack);
    }
}
