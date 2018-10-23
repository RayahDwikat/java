package priorityqueuexample;
import java.util.Iterator;
import java.util.PriorityQueue;
public class PriorityQueuExample {
    public static void main(String[] args) {
        PriorityQueue<String> pq = new PriorityQueue<>();
        pq.offer("Najah");
        pq.offer("BirZeit");
        pq.offer("Islamiyyah");
        pq.offer("Khadoory");
        pq.offer("Quds");
   
        // if you print it without iterator or for loop
        // you could get them in order, or not.
        System.out.println(pq);
        // if you use iterator, you will get tehm from highest priority (the smallest element)
        // to the lower element (the biger element).
        // note that small in value means big in priority
        Iterator<String> i = pq.iterator();
        while(i.hasNext())
            System.out.println(i.next());
        
        // here is a nother example using Double type
        PriorityQueue<Double> pd = new PriorityQueue<>();
        pd.add(12.4);
        pd.add(11.4);
        pd.add(15.4);
        pd.add(23.6);
        pd.add(1272.7262);
        
        Iterator<Double> m = pd.iterator();
        while(m.hasNext())
            System.out.println(m.next());
    }
}

