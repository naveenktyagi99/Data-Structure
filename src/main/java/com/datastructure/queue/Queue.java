package com.datastructure.queue;

import com.datastructure.model.Node;

public class Queue {

    private Node front, rear;

    public Queue(int data) {
        Node node = new Node(data, null);
        front = node;
        rear = node;
    }

    public void insert(int data) {
        Node node = new Node(data, null);
        if (rear == null) {
            front = rear = node;
        }
        rear.setNext(node);
        rear = node;
    }

    public Node deQueue() {
        if (front == null)
            return null;
        Node deletedNode = this.front;
        front = front.getNext();
        return deletedNode;
    }

    public int size() {
        int count = 0;
        Node iterator = front;
        while (iterator.getNext()!= rear) {
            count = count + 1;
            iterator = iterator.getNext();
        }
        return count;
    }

    public void print(){
        Node iterator = front;
        while(iterator!=null){
            System.out.print(iterator.getData() + ", ");
            iterator = iterator.getNext();
        }
    }

    public static void main(String arr[]){
        Queue queue = new Queue(1);
        queue.insert(2);
        queue.insert(3);
        queue.insert(4);
        queue.insert(5);
        queue.insert(6);

        queue.deQueue();
        queue.deQueue();
        queue.deQueue();
        queue.deQueue();

        queue.print();

    }
}
