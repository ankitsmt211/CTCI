package org.alphabee.data_structures.chapter1.impl;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class HashTableTest {

  private HashTable hashTable;
  @BeforeEach
  public void setup(){
    hashTable = new HashTable();
  }
  @Test
  void addWithUniqueValuesShouldReturnTrue() {
    hashTable.add("what");
    Assertions.assertTrue(hashTable.add("something"));
    Assertions.assertTrue(hashTable.add("some"));
  }

  @Test
  void addWithDuplicateValuesShouldReturnFalse() {
    hashTable.add("random");
    Assertions.assertFalse(hashTable.add("random"));
  }

  @Test
  void addWithUniqueValuesShouldIncreaseSize(){
    hashTable.add("car");
    hashTable.add("remote");
    Assertions.assertEquals(hashTable.getSize(),2);
  }


  @Test
  void addWithDuplicateValuesShouldNotIncreaseSize(){
    hashTable.add("car");
    hashTable.add("car");
    Assertions.assertEquals(hashTable.getSize(),1);
  }


  @Test
  void containsShouldReturnTrueForAddedValue(){
    hashTable.add("box");
    Assertions.assertTrue(hashTable.contains("box"));
  }


  @Test
  void containsShouldReturnFalseIfValueIsNotAdded(){
    Assertions.assertFalse(hashTable.contains("box"));
  }

}
