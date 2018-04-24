package com.datastructure.stack;

import com.datastructure.model.Node;

public class QuequeUsingStatcks {

    Stack inbox = new Stack();


    public void QuequeUsingStatcks() {
        inbox = new Stack();
    }

    public void queue(int data) {
        inbox.push(data);
    }

    public int dequeue() {
        Stack popStack = copyToStack(inbox);
        int deQueueElement = popStack.pop();
        inbox = copyToStack(popStack);
        return deQueueElement;
    }

    private Stack copyToStack(Stack source) {
        Stack target = new Stack();
        if (source == null)
            return null;
        else {
            while (!source.isEmpty()) {
                target.push(source.pop());
            }
        }
        return target;
    }

    public void print() {
        Stack target =  copyToStack(inbox);
        Node iterator = target.getHead();
        if (iterator == null) {
            System.out.print("Queue is Empty..");
        }
        System.out.println();
        while (iterator != null) {
            System.out.print(iterator.getData()+"-->");
            iterator = iterator.getNext();
        }
        inbox = copyToStack(target);
    }

    public static void main(String arr[]) {

        QuequeUsingStatcks queue = new QuequeUsingStatcks();
        queue.queue(1);
        queue.queue(2);
        queue.queue(3);
        queue.queue(4);

        queue.print();
        queue.dequeue();
        queue.print();
        queue.dequeue();
        queue.print();
        queue.queue(10);
        queue.print();
    }
}
