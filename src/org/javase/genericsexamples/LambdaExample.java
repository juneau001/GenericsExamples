

package org.javase.genericsexamples;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Juneau
 */
public class LambdaExample {
  
    public static void main(String[] args){
        List<String> bookList = new ArrayList<>();
        bookList.add("Java 8 Recipes");
        bookList.add("Java EE 7 Recipes");
        bookList.add("Introducing Java EE 7");
        bookList.add("JavaFX 8:  Introduction By Example");
        compareStrings(bookList, (n)->n.contains("Java EE"));
    }
    
    public static void compareStrings(List<String> list, Predicate<String> predicate) {
        list.stream().filter((n) -> (predicate.test(n))).forEach((n) -> {
            System.out.println(n + " ");
        });
    }

}
