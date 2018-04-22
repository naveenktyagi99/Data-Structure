package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class MoveLastElementToFrontOfAGivenLinkedList {

    public LinkedList moveLastElementToFrontOfAGivenLinkedList(LinkedList list) {

        if (list == null || list.getStart().getNext() == null)
            return list;
        Node iterator = list.getStart();
        while (iterator.getNext().getNext() != null) {
            iterator = iterator.getNext();
        }
        Node lastNode = iterator.getNext();
        iterator.setNext(null);
        lastNode.setNext(list.getStart());
        list.setStart(lastNode);

        return list;
    }

    public static void main(String arr[]){
        LinkedList list = LinkedList.getLinkedListWithdata(3);
        MoveLastElementToFrontOfAGivenLinkedList object = new MoveLastElementToFrontOfAGivenLinkedList();
        object.moveLastElementToFrontOfAGivenLinkedList(list);
        list.print();
    }
}
