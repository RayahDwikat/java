package dequeexample;

import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;

public class DequeExample {
    public static void main(String[] args) {
        Deque dequeA = new LinkedList();
        // create Deque
        dequeA.add("Programming with C++");
        dequeA.add("Programming with Java");
        System.out.println(dequeA);
        // you can add from both sides.
        dequeA.addFirst("Web 1");
        dequeA.addLast("Web 2");
        System.out.println(dequeA);
        
        // you can get elements from both sides
        String firstElement = (String) dequeA.getFirst();
        String lastElement = (String) dequeA.getLast();
        // also we used castin here because we created the Deque with no tyoe from the 
        // begining, and we added strings in it, so, when we retrieve elements
        // we used String casting
        
        System.out.println(firstElement);
        System.out.println(lastElement);
        System.out.println(dequeA);
        
        //print elements usingiterator
        Iterator iterator = dequeA.iterator();
        while(iterator.hasNext()){
            String element = (String) iterator.next();
            System.out.println(element);
        }
        
        Deque<Integer> integerDeque = new LinkedList<>();
        // here we creted Deque of type Integer
        // of course we add just Integers.
        integerDeque.add(4);
        integerDeque.add(5);
        // when we retrieve elements from the deque here we don't need casting
        
        Integer e = integerDeque.getFirst();
        System.out.println(e);
        
    }
}

