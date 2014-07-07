

package org.javase.genericsexamples.coffeehouse;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

/**
 *
 * @author Juneau
 */
public class JavaHouseVisit {
    public static void main(String[] args){
        JavaHouse javaHouse = new JavaHouse();
        javaHouse.addCup(new ItalianRoast(), 12);
        javaHouse.addCup(new FrenchRoast(), 16);
        javaHouse.addBag(new ItalianRoast(), 12);
        javaHouse.addBag(new DoughnutRoast(), 6);
        //javaHouse.addCup(new Integer(3), 3);  Not a CoffeeType, so does not compile
        javaHouse.checkout();

        // Retrieve the current purchase list
        List<CoffeeSaleType> purchaseList = javaHouse.getCurrentPurchase();
        System.out.println("Number of items in purchase: " + purchaseList.size());

        // Print some further details on the purchased types to learn what our
        // customer enjoys
        purchaseList.stream().forEach((coffeeSale) -> {
            System.out.println(coffeeSale.getType().getType() + " Description - " +
                    coffeeSale.getType().getDescription());
        });

        // How many of the ItalianRoast are contained in this purchase
        System.out.println("Number of Italian Roasts: " +
                javaHouse.countTypes(ItalianRoast.class));
        
        List<CoffeeType> coffeeList = new ArrayList();
        coffeeList.add(new DoughnutRoast());
        coffeeList.add(new FrenchRoast());
        coffeeList.add(new HouseBlend());
        coffeeList.add(new ItalianRoast());
        
        // Print the coffees that match the criteria
        System.out.println("Whole Bean");
        compareCoffee(coffeeList, (n)->n.getDescription().contains(CoffeeType.WHOLE_BEAN));
        System.out.println("Aromatic");
        compareCoffee(coffeeList, (n)->n.getDescription().contains(CoffeeType.AROMATIC));
        System.out.println("Ground");
        compareCoffee(coffeeList, (n)->n.getDescription().contains(CoffeeType.GROUND));
        
    }
    
    /**
     * Compare two types of coffee
     * @param list
     * @param predicate 
     */
    public static void compareCoffee(List<CoffeeType> list, Predicate<CoffeeType> predicate) {
        list.stream().filter((n) -> (predicate.test(n))).forEach((n) -> {
            System.out.println(n + " ");
        });
    }
}

