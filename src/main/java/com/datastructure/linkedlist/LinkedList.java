package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class LinkedList {

    private Node start;

    public LinkedList(int data) {
        start = new Node(data, null);
    }

    public void add(int data) {
        Node node = new Node(data, null);
        Node iterator = start;
        if (start == null) {
            start = node;
            return;
        }
        while (iterator.getNext() != null) {
            iterator = iterator.getNext();
        }
        iterator.setNext(node);
    }

    public Node getNode(int index) {
        Node iterator = start;
        int count = 1;
        if (index == 1)
            return start;
        while (iterator.getNext() != null) {
            if (count == index)
                return iterator;
            count = count + 1;
            iterator = iterator.getNext();
        }
        if (index == count)
            return iterator;
        if (count < index)
            System.out.println("Given index bigger than list size");
        return null;
    }

    public void print() {
        Node iterator = start;
        if (iterator == null) {
            System.out.println("List is Empty...");
            return;
        }
        while (iterator != null) {
            System.out.print(iterator.getData() + " ");
            iterator = iterator.getNext();
        }
    }

    public void delete(int index) {

        Node iterator = start;
        int count = 2;
        if (iterator != null) {
            if (index == 1) {
                start = start.getNext();
                return;
            }
            while (iterator.getNext() != null) {
                if (count == index) {
                    iterator.setNext(iterator.getNext().getNext());
                    return;
                }
                iterator = iterator.getNext();
                if (iterator.getNext() != null)
                    count = count + 1;
            }
            if (index == count) {
                iterator.setNext(null);
            }
            if (index > count)
                System.out.println("Given index bigger than list size...");
        }
    }

    public void update(int index, int data) {

        Node iterator = start;
        int count = 1;
        while (iterator != null) {
            if (count == index) {
                iterator.setData(data);
                return;
            }
            iterator = iterator.getNext();
            if (iterator != null)
                count = count + 1;
        }
        if (index > count)
            System.out.println("Given index bigger than list size...");
    }

    public Node getStart() {
        return start;
    }

    public void setStart(Node start) {
        this.start = start;
    }

    public void deletingGivenKey(int data) {

        Node iterator = start;
        Node temp = start.getNext();
        if (start.getData() == data) {
            start = start.getNext();
            return;
        }
        while (temp.getNext() != null) {
            if (temp.getData() == data) {
                iterator.setNext(temp.getNext());
                return;
            }
            iterator = iterator.getNext();
            temp = temp.getNext();
        }
        if (temp.getData() == data) {
            iterator.setNext(null);
        }
    }

    public int size() {
        Node iterator = start;
        int count = 0;
        if (start.getNext() == null)
            return 1;
        while (iterator != null) {
            count = count + 1;
            iterator = iterator.getNext();
        }
        return count;
    }

    public int recursiveSize(Node node) {
        if (node == null)
            return 0;
        return 1 + recursiveSize(node.getNext());
    }

    public boolean search(int data) {
        Node iterator = start;
        while (iterator != null) {
            if (iterator.getData() == data)
                return true;
            iterator = iterator.getNext();
        }
        return false;
    }

    public boolean recursiceSearch(Node node, int data) {
        if (node == null)
            return false;
        if (node.getData() == data)
            return true;
        return recursiceSearch(node.getNext(), data);
    }

    public Node getNthNode(int index) {
        Node iterator = start;
        int count = 1;
        while (iterator != null) {
            if (count == index)
                return iterator;
            iterator = iterator.getNext();
            count = count + 1;
        }
        return null;
    }

    public Node middleNodeOfList() {
        Node iterator = start;
        Node aheadIterator = iterator;
        if (start.getNext() == null) {
            return start;
        }
        while (aheadIterator != null && aheadIterator.getNext() != null) {
            aheadIterator = aheadIterator.getNext().getNext();
        }
        return iterator;
    }

    public Node getNthNodeFromLast(int indexFromEnd) {
        Node iterator = start;
        Node forward_Pointer = start;
        int count = 1;
        while (forward_Pointer != null && count != indexFromEnd) {
            forward_Pointer = forward_Pointer.getNext();
            count = count + 1;
        }
        if (forward_Pointer == null)
            return null;
        while (forward_Pointer.getNext() != null) {
            forward_Pointer = forward_Pointer.getNext();
            iterator = iterator.getNext();
        }
        return iterator;
    }

    public static LinkedList getLinkedListWithdata(int num) {

        LinkedList list = new LinkedList(0);
        for (int i = 1; i < num; i++)
            list.add(i);
        return list;

    }

    public  Node getLastNode(){

        Node iterator = this.getStart();
        while(iterator.getNext()!=null){
            iterator = iterator.getNext();
        }
        return  iterator;
    }
}
