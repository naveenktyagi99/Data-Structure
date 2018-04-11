package com.datastructure.main;

import com.datastructure.linkedlist.LinkedList;

public class Main {

    public static void main(String arr[]){
        LinkedList list = new LinkedList(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(10);


        System.out.println("Element from Last Element: " + list.getNthNodeFromLast(10).getData());

    }
}
