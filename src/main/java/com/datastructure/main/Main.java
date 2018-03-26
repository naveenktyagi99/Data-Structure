package com.datastructure.main;

import com.datastructure.linkedlist.LinkedList;

public class Main {

    public static void main(String arr[]){
        LinkedList list = new LinkedList(1);
        list.add(2);


        System.out.println("Middle Element: " + list.middleNodeOfList().getData());

    }
}
