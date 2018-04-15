package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class MergeTwoSortedLinkedLists {



    public Node mergeList(LinkedList list1, LinkedList list2) {


        Node iterator1 = list1.getStart();

        Node iterator2 = list2.getStart();
        Node mergeStart = null;
        Node mergeIterator = null;
        while (iterator1 != null && iterator2 != null) {
            if (iterator1 != null && iterator2 != null) {
                if (iterator1.getData() <= iterator2.getData()) {
                    Node currentNode = new Node(iterator1.getData(), null);
                    if(mergeStart==null) {
                        mergeStart = currentNode;
                        mergeIterator = mergeStart;
                        iterator1 = iterator1.getNext();
                        continue;
                    }
                    mergeIterator.setNext(currentNode);
                    iterator1 = iterator1.getNext();
                } else {
                    Node currentNode = new Node(iterator2.getData(), null);

                    if(mergeStart==null) {
                        mergeStart = currentNode;
                        mergeIterator = mergeStart;
                        iterator2 = iterator2.getNext();
                        continue;
                    }
                    mergeIterator.setNext(currentNode);
                    iterator2 = iterator2.getNext();
                }
                mergeIterator = mergeIterator.getNext();
            }
        }
        while (iterator1 != null) {
            Node currentNode = new Node(iterator1.getData(), null);
            mergeIterator.setNext(currentNode);
            iterator1 = iterator1.getNext();
        }
        while (iterator2 != null) {
            Node currentNode = new Node(iterator2.getData(), null);
            mergeIterator.setNext(currentNode);
            mergeIterator = mergeIterator.getNext();
            iterator2 = iterator2.getNext();
        }
        return mergeStart;
    }

    public static void main(String arr[]){
        MergeTwoSortedLinkedLists mergeTwoSortedLinkedLists = new MergeTwoSortedLinkedLists();

        LinkedList list1 = new LinkedList(1);
        list1.add(2);
        list1.add(14);
        list1.add(19);


        LinkedList list2 = new LinkedList(6);
        list2.add(7);
        list2.add(15);
        list2.add(20);
        list2.add(21);
        list2.add(25);

        Node mergeList = mergeTwoSortedLinkedLists.mergeList(list1, list2);
        while(mergeList!=null){
            System.out.println(mergeList.getData());
            mergeList = mergeList.getNext();
        }
    }

}
