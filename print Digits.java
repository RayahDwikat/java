
package printdigits;
import java.util.*;
public class PrintDigits {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        printDigitsOfNumber(number);
        int n = countDigits(number);
        System.out.println(n);
        //System.out.println(countDigits(number));
    }
    
    public static void printDigitsOfNumber(int number){
        if(number==0) return;
        else {
            System.out.println(number%10);
            printDigitsOfNumber(number/10);
        }
    }
    public static int countDigits(int number){
       int counter=0;
       while(number>0){
           number = number/10;
           counter++;
       }
       return counter;
    }
}
