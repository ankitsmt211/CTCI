package org.alphabee.data_structures.chapter1.questions;

import java.util.HashSet;
import java.util.Set;

/*
* An algo to detect if string has all unique characters
* */
public class IsUnique {
  public static void main(String[] args) {
    boolean result=approachOne("");
    boolean result2 = approachTwo("");
    System.out.println(result);
    System.out.println(result2);

  }

  // Using a set
  //returns false if element already exists
  public static boolean approachOne(String inputString){
    Set<Character> store = new HashSet<>();
    for(char c: inputString.toCharArray()){
      if(!store.add(c)){
        return false;
      }
    }
    return true;
  }

  //Using Hash table
  public static boolean approachTwo(String inputString){
    boolean [] hashTable = new boolean[52];

    for(int i=0;i<inputString.length();i++){
      char currentCharacter = inputString.charAt(i);
      //ASCII value of a-z = 97-122 and A-Z = 65-90
      if(hashTable[currentCharacter-'A']==false){
        hashTable[currentCharacter-'A']=true;
      }
      else {
        return false;
      }

    }
    return true;
  }


  // No data structure
  public static boolean approachThree(String inputString){
    return true;
  }
}
