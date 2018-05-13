package com.datastructure.tree;

public class BinaryTree {

    private Node root;

    public BinaryTree(int data) {
        this.root = new Node(data);
    }

    public void insert(int data) {
        insert(root, data);
    }

    private void insert(Node root, int data) {
        if (root.getData() > data) {
            if (root.getLeft() == null) {
                root.setLeft(new Node(data));
            } else {
                insert(root.getLeft(), data);
            }
        } else {
            if (root.getRight() == null) {
                root.setRight(new Node(data));
            } else {
                insert(root.getRight(), data);
            }
        }
    }

    public void printInOrder(Node root) {
        if (root == null)
            return;
        printInOrder(root.getLeft());
        System.out.print(root.getData() + " ");
        printInOrder(root.getRight());
    }

    public void printPostOrder(Node root) {
        if (root == null)
            return;
        printPostOrder(root.getLeft());
        printPostOrder(root.getRight());
        System.out.print(root.getData() + " ");
    }

    public void printPrerder(Node root) {
        if (root == null)
            return;
        System.out.print(root.getData() + " ");
        printPrerder(root.getLeft());
        printPrerder(root.getRight());
    }

    public Node getRoot() {
        return root;
    }

    public static void main(String arr[]) {
        BinaryTree btree = new BinaryTree(14);
        btree.insert(11);
        btree.insert(10);
        btree.insert(15);
        btree.insert(19);
        btree.insert(9);
        btree.insert(6);

        System.out.print("Printing InOrder: ");
        btree.printInOrder(btree.getRoot());
        System.out.println();
        System.out.print("Printing PostOrder: ");
        btree.printPostOrder(btree.getRoot());
        System.out.println();
        System.out.print("Printing PreOrder: ");
        btree.printPrerder(btree.getRoot());
    }
}

class Node {

    private int data;
    private Node left;
    private Node right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
