package org.alphabee.data_structures.chapter1.impl;


public class Main {
  public static void main(String[] args) {
    HashTable hashTable = new HashTable();
    hashTable.add("first");
    hashTable.add("second");
    hashTable.add("third");
    hashTable.add("sample");
    hashTable.add("whatever");
    hashTable.add("what");
    hashTable.display();
    System.out.println(hashTable.contains("what"));
  }
}
