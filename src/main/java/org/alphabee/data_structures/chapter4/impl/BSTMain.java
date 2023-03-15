package org.alphabee.data_structures.chapter4.impl;

public class BSTMain {
  public static void main(String[] args) {
    BST tree = new BST();
    tree.insert(new Node(5));
    tree.insert(new Node(4));
    tree.insert(new Node(7));
    tree.insert(new Node(20));
    tree.insert(new Node(0));
    tree.display();
  }
}
