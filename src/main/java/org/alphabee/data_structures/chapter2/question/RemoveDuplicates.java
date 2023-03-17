package org.alphabee.data_structures.chapter2.question;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Set;

/*
* Removes Duplicates from an unsorted linked-list
*/
public class RemoveDuplicates {


  public static void main(String[] args) {
    approachOne(duplicateList);
    System.out.println(duplicateList);
  }


  public static List<Integer> duplicateList = new LinkedList<>(Arrays.asList(3,2,2,4,7,7,9,1));

  //uses HashSet
  public static void approachOne(List<Integer> duplicateList){

    Set<Integer> containsUnique = new HashSet<>();

    for(int i=0;i<duplicateList.size();i++){
      if(containsUnique.contains(duplicateList.get(i))){
        duplicateList.remove(i);
        continue;
      }
      else containsUnique.add(duplicateList.get(i));
    }
  }

}
