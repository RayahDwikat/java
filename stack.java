
package stackexample;
import java.util.*;
public class StackExample {

    public static void main(String[] args) {
        Stack<String> stringStack = new Stack<>();
        stringStack.push("Nablus");
        stringStack.add("Jerusalem");
        stringStack.push("Tulkarm");
        System.out.println(stringStack);
        stringStack.pop();
        System.out.println(stringStack);
        System.out.println(stringStack.peek());
        System.out.println(stringStack);
        System.out.println(stringStack.isEmpty());
        int found = stringStack.search("Nablus");
        System.out.println(found);
        found = stringStack.search("Jerusalem");
        System.out.println(found);
        found = stringStack.search("Tulkarm");
        System.out.println(found);
        
    }
    
}
