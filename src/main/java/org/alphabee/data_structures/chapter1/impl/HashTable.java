package org.alphabee.data_structures.chapter1.impl;

import java.util.LinkedList;

/* implementing Hash Table in Java
    using Arrays and LinkedList
 */
public class HashTable {
  private final LinkedList<String>[] array;
  private int size = 0;
  private final int DEFAULT_LENGTH = 10;

  public HashTable() {
    array = new LinkedList[DEFAULT_LENGTH];

    for (int i = 0; i < DEFAULT_LENGTH; i++) {
      array[i] = new LinkedList<>();
    }

  }


  public int getSize() {
    return size;
  }

  public boolean add(String val) {

    if (!contains(val)) {
      int hash = val.hashCode();
      int index = Math.abs(hash % array.length);
      array[index].add(val);
      size++;
      return true;
    }

    return false;
  }


  public boolean contains(String val) {
    int hash = val.hashCode();
    int index = Math.abs(hash % array.length);

    if (!array[index].isEmpty()) {
      return array[index].contains(val);
    }

    return false;
  }

  public void display() {

    for (int i = 0; i < array.length; i++) {
      if (!array[i].isEmpty()) {
        System.out.println(array[i]);
      }
    }

  }

}
