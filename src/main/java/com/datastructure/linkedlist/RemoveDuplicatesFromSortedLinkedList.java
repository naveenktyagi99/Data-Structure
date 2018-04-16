package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class RemoveDuplicatesFromSortedLinkedList {

    public void removeDuplicate(LinkedList list){
        Node iterator = list.getStart();
        while(iterator.getNext()!=null){
            if(iterator.getData() == iterator.getNext().getData()){
                deleteDuplicateNode(iterator, iterator.getNext());
            }
            iterator = iterator.getNext();
        }
    }
    private void deleteDuplicateNode(Node current, Node nextNode){
        current.setNext(nextNode.getNext());
    }

    public static void main(String arr[]){
        RemoveDuplicatesFromSortedLinkedList removeDuplicate  = new RemoveDuplicatesFromSortedLinkedList();
        LinkedList list = new LinkedList(0);
        list.add(1);
        list.add(2);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(4);
        list.add(5);

        removeDuplicate.removeDuplicate(list);
        list.print();
    }
}
