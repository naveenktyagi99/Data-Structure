package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class PairwiseSwapElementsOfAGivenLinkedList
{

    public void pairwiseSwapElementsOfAGivenLinkedList(LinkedList list){

        if(list==null || list.getStart()==null)
            return;
        Node iterator = list.getStart();
        while(iterator!=null){
            Node nextNode = iterator.getNext();
            swap(iterator, nextNode);
            iterator = nextNode.getNext();
        }
    }

    private void swap(Node current, Node next){
        int currentNodeData = current.getData();
       current.setData(next.getData());
       next.setData(currentNodeData);
    }

    public static void main(String arr[]){
        LinkedList list = LinkedList.getLinkedListWithdata(10);
        PairwiseSwapElementsOfAGivenLinkedList object = new PairwiseSwapElementsOfAGivenLinkedList();
        object.pairwiseSwapElementsOfAGivenLinkedList(list);
        list.print();
    }
}
