

package org.javase.genericsexamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Juneau
 */
public class ObjectExample {
    public static void main(String[] args){
        testObject();
        testGenerics();
        collectionsTests();
    }
    
    public static void testObject(){
        ObjectContainer myObj = new ObjectContainer();
        
        // store a string
        myObj.setObj("Test");
        System.out.println("Value of myObj:" + myObj.getObj());
        // store an int
        myObj.setObj(3);
        System.out.println("Value of myObj:" + myObj.getObj());
        
        List objectList = new ArrayList();
        objectList.add(myObj);
        // We have to cast...and we must be sure to cast the correct type!
        // String myStr = (String) ((ObjectContainer)objectList.get(0)).getObj(); // ClassCastException

    }
    
    /**
     * Utilizing a container that uses generics allows us to store any type
     * of data within the object in a type-safe manner
     */
    public static void testGenerics(){
        GenericContainer<String> stringContainer = new GenericContainer<String>();
        stringContainer.setObj(new String("Test"));
        //stringContainer.setObj(3); // will not compile...type error
        System.out.println("Value of stringContainer :" + stringContainer.getObj());
        GenericContainer<Integer> intContainer = new GenericContainer<Integer>();
        intContainer.setObj(3);
        intContainer.setObj(5);
        //intContainer.setObj("Int");  // will not compile
        System.out.println("Value of intContainer: " + intContainer.getObj());
    }
    
    public static void collectionsTests(){
        List myObjList = new ArrayList();

        for(int x=0; x <=10; x++){
            ObjectContainer myObj = new ObjectContainer();
            myObj.setObj("Test" + x);
            myObjList.add(myObj);
        }
        // Get the objects, we need to cast
        for(int x=0; x <= myObjList.size()-1; x++){
            ObjectContainer obj = (ObjectContainer) myObjList.get(x); 
            System.out.println("Object Value: " + obj.getObj());
        }

        List<GenericContainer> genericList = new ArrayList<GenericContainer>();

        for(int x=0; x <=10; x++){
            GenericContainer<String> myGeneric = new GenericContainer<String>();
            myGeneric.setObj(" Generic Test" + x);
            genericList.add(myGeneric);
        }
        // Get the objects, no need to cast
        for(int x=0; x <= myObjList.size()-1; x++){
            GenericContainer<String> obj = genericList.get(x); 
            String objectString = obj.getObj();
            // Do something with the string...here we will print it
            System.out.println(objectString);
        }
        
    }
}
