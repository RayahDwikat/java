
package palindrome;
import java.util.*;
public class Palindrome {

    public static void main(String[] args) {
        // TODO code application logic here
        Scanner s = new Scanner(System.in);
        String number = s.next();
        if(checkPalindrome(number)==true)
            System.out.println(number + " is palindrome");
        else System.out.println(number + " is not palindrome");

    }
    public static boolean checkPalindrome(String number){
        System.out.println(number.length());
        if(number.length()==1 || number.length()==0) return true;
        else if(number.charAt(0)==number.charAt(number.length()-1))
            return checkPalindrome(number.substring(1,number.length()-1));
        else return false;
    }
}

