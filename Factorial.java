
package factorial;
import java.util.*;
public class Factorial {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        System.out.println(fact(number));
    }
    public static int fact(int number){
        System.out.println(number);
        if(number==1) return 1;
        else return number * fact(number-1);
    }
}

