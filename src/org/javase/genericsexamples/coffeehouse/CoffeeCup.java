
package org.javase.genericsexamples.coffeehouse;

/**
 *
 * @author Juneau
 */
public class CoffeeCup implements Cup {
    private double cupSize;
    private CoffeeType type;
    
    public CoffeeCup(CoffeeType type,
                     double cupSize){
        this.type = type;
        this.cupSize = cupSize;
    }

    /**
     * @return the cupSize
     */
    public double getCupSize() {
        return cupSize;
    }

    /**
     * @param cupSize the cupSize to set
     */
    public void setCupSize(double cupSize) {
        this.cupSize = cupSize;
    }

    /**
     * @return the type
     */
    public CoffeeType getType() {
        return type;
    }

    /**
     * @param type the type to set
     */
    public void setType(CoffeeType type) {
        this.type = type;
    }
    

}
