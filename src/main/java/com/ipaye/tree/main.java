package com.ipaye.tree;



public class main {

    public static void main(String[] args) {
        BinaryTree tree = new BinaryTree();
        tree.insert(8);
        tree.insert(17);
        tree.insert(27);
        tree.insert(47);
        tree.insert(87);
        tree.insert(97);


        tree.inOrder();
    }
}