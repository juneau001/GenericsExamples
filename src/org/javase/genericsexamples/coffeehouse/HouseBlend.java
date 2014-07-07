

package org.javase.genericsexamples.coffeehouse;

import java.util.ArrayList;
import java.util.List;


/**
 *
 * @author Juneau
 */
public class HouseBlend extends CoffeeType implements Light {
    List<String> description;
    
    public HouseBlend(){
        description = new ArrayList();
        description.add(TOASTY);
        description.add(GROUND);
    }
    
    @Override
    public List<String> getDescription(){
        return description;
    }
    
    
}

