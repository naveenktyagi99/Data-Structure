package com.datastructure.linkedlist;

import com.datastructure.model.Node;

import java.util.HashSet;
import java.util.Set;

public class IntersectionPointOfTwoLinkedLists {

    public Node interactionPoint(LinkedList list1, LinkedList list2) {

        Set<Node> commonNode = new HashSet<Node>();
        Node iterator1 = list1.getStart();
        Node iterator2 = list2.getStart();
        while (iterator1 != null || iterator2 != null) {

            if (commonNode.contains(iterator1)) {
                return iterator1;
            } else if (commonNode.contains(iterator2)) {
                return iterator2;
            } else {
                commonNode.add(iterator1);
                commonNode.add(iterator2);
                iterator1 = iterator1.getNext();
                iterator2 = iterator2.getNext();
            }
        }
        return null;
    }

    public static void main(String arr[]) {

        LinkedList list = LinkedList.getLinkedListWithdata(5);
        LinkedList list2 =  LinkedList.getLinkedListWithdata(5);

        Node lastNode = list2.getLastNode();
        lastNode.setNext(list.getStart().getNext().getNext().getNext());

        IntersectionPointOfTwoLinkedLists intersectionPointOfTwoLinkedLists = new IntersectionPointOfTwoLinkedLists();
        Node commonNode = intersectionPointOfTwoLinkedLists.interactionPoint(list, list2);

        System.out.println("Intersection Point Of Two LinkedLists: " + commonNode.getData());
    }
}
