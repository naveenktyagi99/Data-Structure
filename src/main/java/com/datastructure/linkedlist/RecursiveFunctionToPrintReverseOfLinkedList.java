package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class RecursiveFunctionToPrintReverseOfLinkedList {

    public String printRecursiveListThroughRecursion(Node start) {

        if (start == null)
            return "";
        else
            return start.getData() + "->" + printRecursiveListThroughRecursion(start.getNext());
    }

    public static  void main(String arr[]){
        RecursiveFunctionToPrintReverseOfLinkedList recursionMethod = new RecursiveFunctionToPrintReverseOfLinkedList();
        LinkedList list = LinkedList.getLinkedListWithdata(10);
        System.out.println(recursionMethod.printRecursiveListThroughRecursion(list.getStart()));
    }
}
