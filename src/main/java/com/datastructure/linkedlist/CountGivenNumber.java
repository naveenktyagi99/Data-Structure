package com.datastructure.linkedlist;

import com.datastructure.model.Node;

public class CountGivenNumber {

    public int countNumber(LinkedList list, int num) {

        int count = 0;
        Node iteration = list.getStart();
        while (iteration.getNext() != null) {
            if (iteration.getData() == num)
                count = count + 1;
            iteration = iteration.getNext();
        }
        if (iteration.getData() == num)
            return count + 1;
        return count;
    }

    public static void main(String arr[]) {
        LinkedList list = LinkedList.getLinkedListWithdata(10);
        list.add(5);
        list.add(5);
        list.add(5);

        CountGivenNumber countGivenNumber = new CountGivenNumber();

        System.out.println("No of times: " + countGivenNumber.countNumber(list, 5));
    }
}
