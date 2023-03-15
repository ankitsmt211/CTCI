package org.alphabee.data_structures.chapter4.impl;
/*
* Simple implementation of BST
 */
public class BST {
   Node root;

  public void insert(Node node){
    root = insertHelper(root,node);
  }


  private Node insertHelper(Node root,Node node){
    int data=node.val;
    if(root==null){
      root=node;
      return root;
    }

    else if(data<root.val ){
      root.left = insertHelper(root.left,node);
    }
    else{
      root.right = insertHelper(root.right,node);
    }
    return root;
  }


  public void display(){
    displayHelper(root);
  }


  private static void displayHelper(Node root){
    if(root!=null){
      displayHelper(root.left);
      System.out.println(root.val);
      displayHelper(root.right);
    }
  }
}
