package iteratorexample;
import java.util.*;
public class IteratorExample {

    public static void main(String[] args) {
        Collection<String> coll1 = new ArrayList<>();
        coll1.add("Tulkarm");
        coll1.add("Qalqilia");
        coll1.add("Jerusalem");
        coll1.add("Yafa");
        
        Iterator<String> itr = coll1.iterator();
        
        System.out.println("Printing out elements of the collection");
        int counter = 1;
        while(itr.hasNext()){
            System.out.println("Element " + counter + ": " + itr.next());
            counter++;
        }
        
        itr = coll1.iterator(); // this is to make itr to return from the begining
        
        System.out.println("Searching for element");
        while(itr.hasNext()){
            if(itr.next() == "Jerusalem") System.out.println("Jerusalem is found");
        }
    }
    
}
