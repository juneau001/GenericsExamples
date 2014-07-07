
package org.javase.genericsexamples;

/**
 *
 * @author Juneau
 */
public class Calculator {
    
    /**
     * Example of a non-generic add method, which works only with Integer types.
     * @param a
     * @param b
     * @return 
     */
    public static Integer addInteger(Integer a, Integer b){
        return a + b;
    }
    
    /**
     * Example of non-generic add method, which works only with Float types.
     * @param a
     * @param b
     * @return 
     */
    public static Float addFloat(Float a, Float b){
        return a + b;
    }
    
    /**
     * Generic method that accepts two GenericContainer objects, and adds their
     * values together, returning the result in double format
     * @param <N>
     * @param a
     * @param b
     * @return 
     */
    public static <N extends Number> double add(N a, N b){
        double sum = 0;
        sum = a.doubleValue() + b.doubleValue();
        return sum;
    }   
    
   
    
    
}
