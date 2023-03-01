package org.alphabee.data_structures.chapter2.impl;

import java.util.NoSuchElementException;

/*
 Implementing Linked-list from scratch
 */
public class CustomLinkedList {

  private Node head;
  private  int size;
  public CustomLinkedList(){}

  public CustomLinkedList(int value){
    initialiseHead(value);
  }

  public Node getHead() {
    return head;
  }

  //add element at end of list
  public void addLast(int value){
    addAt(getSize()-1,value);
  }

  //add element at a particular index
  public void addAt(int index, int value){
    int currentPosition=0;
    if(index==0){
      addFirst(value);
      return;
    }
    if(index>getSize()){
      throw new IndexOutOfBoundsException("Size of CustomLinkedList: "+getSize()+" and index: "+index+" is out of bounds");
    }

    if(head!=null){
      Node ptr = head;
      while(ptr!=null && currentPosition<index-1){
        currentPosition++;
        ptr=ptr.getNext();
      }

      Node node = new Node(value);
      Node temp = ptr.getNext();
      ptr.setNext(node);
      node.setNext(temp);
      size++;
    }
    else{
      initialiseHead(value);
    }
  }


  public void addFirst(int value) {
   if(head==null){
     initialiseHead(value);
   }
   else{
     Node node = new Node(value);
     node.setNext(head);
     head = node;
   }
  }


  public boolean remove(int value){
    if(head==null){
      throw new NoSuchElementException("No such element exits");
    }

    else if(head.getValue()==value){
      head=head.getNext();
      return true;
    }
   else {
      Node ptr = head;
      while(ptr!=null){
        if(ptr.getNext().getValue()==value){
          ptr.setNext(ptr.getNext().getNext());
          return true;
        }
        ptr=ptr.getNext();
      }
      return false;
    }
  }

  public void removeLast(){
    //TODO
  }

  public void removeAt(int index){
    //TODO
  }


  private void initialiseHead(int value){
    head = new Node(value);
    size++;
  }

  public int getSize() {
    return size;
  }

  //TODO: Iterable for iterating

  @Override
  public String toString() {
    Node ptr = head;
    StringBuilder sb = new StringBuilder();
    while(ptr!=null){
      sb.append(ptr.getValue());
      sb.append(" ");
      ptr=ptr.getNext();
    }
    return sb.toString();
  }
}
