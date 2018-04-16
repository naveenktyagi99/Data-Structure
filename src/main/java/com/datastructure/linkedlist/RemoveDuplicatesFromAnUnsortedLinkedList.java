package com.datastructure.linkedlist;

import com.datastructure.model.Node;

import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicatesFromAnUnsortedLinkedList {

    public void removeDupplicate(LinkedList list){
        HashSet<Integer> nodeSet = new HashSet<Integer>();

        Node iterator = list.getStart();
        while(iterator!=null){
            if(nodeSet.contains(iterator.getData())){
                removeDuplicate(iterator, iterator.getNext());
            }
            else{
                nodeSet.add(iterator.getData());
            }
            iterator = iterator.getNext();
        }
    }

    private void removeDuplicate(Node current, Node next){
        current.setNext(next.getNext());
    }

    public static void main(String arr[]){

        RemoveDuplicatesFromAnUnsortedLinkedList removeDuplicate = new RemoveDuplicatesFromAnUnsortedLinkedList();
        LinkedList list  = new LinkedList(0);
        list.add(1);
        list.add(5);
        list.add(5);
        list.add(6);
        list.add(6);

        removeDuplicate.removeDupplicate(list);
        list.print();

    }

}
