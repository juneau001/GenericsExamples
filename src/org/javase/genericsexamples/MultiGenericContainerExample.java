
package org.javase.genericsexamples;

/**
 * Using a generic map implementation
 * @author Juneau
 */
public class MultiGenericContainerExample {
    public static void main(String[] args){
        MultiGenericContainer<String, String> mondayWeather =
                new MultiGenericContainer<String, String>("Monday", "Sunny");
        MultiGenericContainer<Integer, Double> dayOfWeekDegrees = 
                new MultiGenericContainer<>(1, 78.0);

        String mondayForecast = mondayWeather.getFirstPosition();
        
        // The following would result in an incompatible types error
        // int mondayOutlook = mondayWeather.getSecondPosition();
        double sundayDegrees = dayOfWeekDegrees.getSecondPosition();
        
        // Change the Monday outlook to cloudy
        mondayWeather.setSecondPosition("Cloudy");
        // Attempt to accidentally pass the temperature to the mondayWeather instance
        // as the secondPosition will result in a compiler error
        // mondayWeather.setSecondPosition(80.0);

        
    }
}
