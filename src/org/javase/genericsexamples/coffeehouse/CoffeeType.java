

package org.javase.genericsexamples.coffeehouse;

import java.util.List;

/**
 *
 * @author Juneau
 */
public abstract class CoffeeType {
    static final String ROBUST = "ROBUST";
    static final String BOLD = "BOLD";
    static final String AROMATIC = "AROMATIC";
    static final String SWEET = "SWEET";
    static final String TOASTY = "TOASTY";
    static final String WINEY_UNDERTONES = "WINEY";
    static final String MEDIUM = "MEDIUM";
    static final String GROUND = "GROUND";
    static final String WHOLE_BEAN = "WHOLE_BEAN";
    
    public Class<? extends CoffeeType> getType(){
        return this.getClass();
    };
    
    public abstract List<String> getDescription();
}
