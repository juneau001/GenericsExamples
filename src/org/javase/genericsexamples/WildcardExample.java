/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package org.javase.genericsexamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juneau
 */
public class WildcardExample {
    public static void main(String[] args){
        List<Integer> intList = new ArrayList<Integer>();
        intList.add(2);
        intList.add(4);
        intList.add(6);

        List<String> strList = new ArrayList<String>();
        strList.add("two");
        strList.add("four");
        strList.add("six");

        List<Object> objList = new ArrayList<Object>();
        objList.add("two");
        objList.add("four");
        objList.add(strList);

        printList(intList);
        printList(strList);
        printList(objList);
        checkList(intList, 3);
        checkList(objList, strList);
        checkList(strList, objList);
        
        checkNumber(intList, 3);
        // The following will not work since strList is not a List of Number types
        //checkNumber(strList, "three");
    }
    
    /**
     * This method will print a List of unknown type
     * @param myList 
     */
    public static <T> void printList(List<T> myList){
        for(Object e:myList){
            System.out.println(e);
        }
    }
    
    public static <T> void checkList(List<?> myList, T obj){
        if(myList.contains(obj)){
            System.out.println("The list " + myList + " contains the element: " + obj);
        } else {
            System.out.println("The list " + myList + " does not contain the element: " + obj);
        }
    }
    
    public static <T> void checkNumber(List<? extends Number> myList, T obj){
        if(myList.contains(obj)){
            System.out.println("The list " + myList + " contains the element: " + obj);
        } else {
            System.out.println("The list " + myList + " does not contain the element: " + obj);
        }
    }
}
