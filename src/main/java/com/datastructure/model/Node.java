package com.datastructure.model;

public class Node {

    private int data;
    private Node next;

    public Node() {
    }

    public Node(int data, Node next) {
        this.data = data;
        this.next = next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        Node object = (Node) o;
        if (o == null)
            return false;
        else {
            if (object.getData() == this.getData())
                return true;
            return false;
        }
    }

    @Override
    public int hashCode() {
        return 31 * data;
    }
}