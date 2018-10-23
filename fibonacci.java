
package fibonacci;

public class Fibonacci {

    public static void main(String[] args) {
        System.out.println(fib(7));
    }
    public static int fib(int num){
        System.out.println(num);
        if(num==0 || num==1) return num;
        else return fib(num-1) + fib(num-2);
    }
}
