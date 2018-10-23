
package vectorexample;

import java.util.Vector;
public class VectorExample {
    public static void main(String[] args) {
        Vector v = new Vector();
        //This will create empty vector with initial capacity=10 and size=0
        // capacity is the maximum number of elements occupied in memory for vector
        // this capacity can be extended during the run time if more elements were added.
        v.add(10);
        v.add(15);
        // print contents of vector
        System.out.println(v);
        v.add(20);
        // print capacity of vector
        System.out.println(v.capacity());
        // print size (number if actual elements) in vector
        System.out.println(v.size());
        
        v.insertElementAt(25, 2); // this will insert the number 25 at position 2
        System.out.println(v);
        
        boolean found = v.contains(20); // searching for the element 20, if found returns true
        System.out.println(found);
        found = v.contains(30);
        System.out.println(found);
        
        Integer data =(Integer) v.elementAt(1); // return the element at position 1 if found
        // we need casting here because from the beginning the vector v has no data type
        // but we know that it contains Integers, so we did casting
        System.out.println(data);
        v.add("Ahmad");
        System.out.println(v);
        String x = (String) v.elementAt(4);
    }
    
}
