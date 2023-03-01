package org.alphabee.data_structures.chapter2.impl;

import java.util.NoSuchElementException;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

class CustomLinkedListTest {
  CustomLinkedList customLinkedListWithNoHead;
  CustomLinkedList customLinkedListWithHead;
  @BeforeEach
  public  void setup(){
    customLinkedListWithNoHead = new CustomLinkedList();
    customLinkedListWithHead = new CustomLinkedList(4);
  }

  @ValueSource(ints={1,3,4,10})
  @ParameterizedTest
  void  addLastForListWithNoHeadTest(int value) {
    customLinkedListWithNoHead.addLast(value);
    Assertions.assertEquals(customLinkedListWithNoHead.getSize(),1);
    Assertions.assertEquals(customLinkedListWithNoHead.getHead().getValue(),value);
    Assertions.assertEquals(customLinkedListWithNoHead.getHead().getNext(),null);
  }

  @ValueSource(ints={1,3,4,10})
  @ParameterizedTest
  void  addLastForListWithHeadTest(int value) {
    customLinkedListWithHead.addLast(value);
    Assertions.assertEquals(customLinkedListWithHead.getSize(),2);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getValue(),4);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getNext().getValue(),value);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getNext().getNext(),null);
  }



  @Test
  void addAtForListWithNoHead() {
    customLinkedListWithNoHead.addAt(0,3);
    Assertions.assertEquals(customLinkedListWithNoHead.getHead().getValue(),3);

  }

  @Test
  void addAtForListWithHead() {
    customLinkedListWithHead.addAt(0,3);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getValue(),3);

  }

  @Test
  void addFirstListWithNoHead() {
    customLinkedListWithNoHead.addFirst(3);
    Assertions.assertEquals(customLinkedListWithNoHead.getHead().getValue(),3);
    Assertions.assertEquals(customLinkedListWithNoHead.getHead().getNext(),null);
  }

  @Test
  void addFirstListWithHead() {
    customLinkedListWithHead.addFirst(3);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getValue(),3);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getNext().getValue(),4);
    Assertions.assertEquals(customLinkedListWithHead.getHead().getNext().getNext(),null);
  }

  @Test
  void removeForListWithNoHead() {
    Assertions.assertThrows(NoSuchElementException.class,()->customLinkedListWithNoHead.remove(3),"No such element present");
    customLinkedListWithNoHead.addLast(3);
    Assertions.assertTrue(customLinkedListWithNoHead.remove(3));

  }

}
