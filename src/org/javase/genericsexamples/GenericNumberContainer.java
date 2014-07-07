
package org.javase.genericsexamples;

/**
 *
 * @author Juneau
 */
public class GenericNumberContainer <T extends Number> {
    private T obj;

    public GenericNumberContainer(){
    }
    
    public GenericNumberContainer(T t){
        obj = t;
    }
    /**
     * @return the obj
     */
    public T getObj() {
        return obj;
    }

    /**
     * @param obj the obj to set
     */
    public void setObj(T t) {
        obj = t;
    }
}

