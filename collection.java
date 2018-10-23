
package collectionexample;
import java.util.*;

public class CollectionExample {

    public static void main(String[] args) {
        ArrayList<String> coll1 = new ArrayList<>();
        coll1.add("Nablus");
        coll1.add("Tubas");
        coll1.add("Jerusalem");
        coll1.add("Akka");
        System.out.println("Elements of Collection 1 are:" + coll1);
        System.out.println("does collection 1 has Jerusalem?"+ coll1.contains("Jerusalem"));
        System.out.println("Size of collection 1 (number of its lements):" + coll1.size());
        coll1.remove("Tubas");
        System.out.println("Size of collection 1 (number of its lements):" + coll1.size());
        
        Collection<String> coll2 = new ArrayList<>();
        coll2.add("Tulkarm");
        coll2.add("Qalqilia");
        coll2.add("Jerusalem");
        coll2.add("Yafa");
        
        
        ArrayList<String> coll3 = (ArrayList<String>)(coll1.clone());
        System.out.println("Elements of Collection 3 are:" + coll3);
        coll3.addAll(coll2);
        System.out.println("Elements of Collection 3 are:" + coll3);
        
        coll3 = (ArrayList<String>)(coll1.clone());
        System.out.println("Elements of Collection 3 are:" + coll3);
        coll3.retainAll(coll2);
        System.out.println("Elements of Collection 3 are:" + coll3);
        
        coll3 = (ArrayList<String>)(coll1.clone());
        System.out.println("Elements of Collection 3 are:" + coll3);
        coll3.removeAll(coll2);
        System.out.println("Elements of Collection 3 are:" + coll3);

    }
    
}
