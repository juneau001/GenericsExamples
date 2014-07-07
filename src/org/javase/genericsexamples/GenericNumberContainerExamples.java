

package org.javase.genericsexamples;

/**
 *
 * @author Juneau
 */
public class GenericNumberContainerExamples {
    public static void main(String[] args){
        GenericNumberContainer<Integer> gn = new GenericNumberContainer<Integer>();
        gn.setObj(3);
        // Type argument String is not within the upper bounds of type-variable T
        //GenericNumberContainer<String> gn2 = new GenericNumberContainer<String>();
    }
}
