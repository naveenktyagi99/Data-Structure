package com.datastructure.linkedlist;

import com.datastructure.model.Node;

import java.util.LinkedHashSet;
import java.util.Set;

public class DetectLoop {

    public boolean findLoop(LinkedList list){
        Set<Node> hashTable = new LinkedHashSet<Node>();
        Node iterator = list.getStart();
        while(iterator!=null){
            if(hashTable.contains(iterator))
                return true;
            hashTable.add(iterator);
            iterator = iterator.getNext();
        }
        return false;
    }

    public static void main(String arr[]){
        LinkedList list = LinkedList.getLinkedListWithdata(5);
        DetectLoop detectLoop = new DetectLoop();
        Node iterator = list.getStart();
        while(iterator.getNext()!=null){
            iterator = iterator.getNext();
        }
        iterator.setNext(list.getStart());
        System.out.println(detectLoop.findLoop(list));
    }
}
