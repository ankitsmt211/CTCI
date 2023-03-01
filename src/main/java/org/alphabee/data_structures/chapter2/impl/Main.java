package org.alphabee.data_structures.chapter2.impl;

public class Main {
  public static void main(String[] args) {
    CustomLinkedList customLinkedList = new CustomLinkedList();

    customLinkedList.addLast(5);
    customLinkedList.addLast(7);
    customLinkedList.addFirst(1);
    customLinkedList.addAt(1,88);
    customLinkedList.addFirst(3);
    //customLinkedList.addAt(4,34);

    System.out.println(customLinkedList);
    //System.out.println(customLinkedList.getSize());

  }
}
