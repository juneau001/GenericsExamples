

package org.javase.genericsexamples;

/**
 *
 * @author Juneau
 */
public class CalculatorExample {
    public static void main(String[] args){

        float floatValue = Calculator.addFloat(2f, 3f);
        System.out.println("Float Value: " + floatValue);
        
        int intValue = Calculator.addInteger(3, 4);
        System.out.println("Integer Value: " + intValue);
        
        double genericValue1 = Calculator.add(3, 3f);
        System.out.println("The int + float result: " + genericValue1);
        
        double genericValue2 = Calculator.add(7.54, 174);
        System.out.println("The double + int result: " + genericValue2);
        
        // Causes a ClassCastException because String is not a subtype of java.lang.Number
        //double genericValue3 = Calculator.add("Not valid", 3f);
        //System.out.println("The invalid result: " + genericValue3);
    }
}
