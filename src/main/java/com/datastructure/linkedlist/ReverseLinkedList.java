package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class ReverseLinkedList {

    public Node reverse(LinkedList list){

         Node first = list.getStart();
         Node second = first.getNext();
         Node iterator = second.getNext();
         first.setNext(null);
         while(iterator!=null){
             second.setNext(first);
             first = second;
             second = iterator;
             iterator = iterator.getNext();
         }
         second.setNext(first);
         list.setStart(second);
        return second;

    }

    public static void main(String arr[]){
        ReverseLinkedList reverseLinkedList = new ReverseLinkedList();
        LinkedList list = LinkedList.getLinkedListWithdata(10);
        Node iterator = reverseLinkedList.reverse(list);
        while(iterator!=null){
            System.out.println(iterator.getData());
            iterator = iterator.getNext();
        }
    }
}
