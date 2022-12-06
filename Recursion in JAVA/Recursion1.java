/**
 * Recursion1
 */
//Printing n fibonacco number using recursion
public class Recursion1 {

    public static void main(String[] args) {
        System.out.println(fib(7 ));
    }
    public static int fib(int x)
    {
        if(x==1 || x==2)
        {
            return 1;
        }
        else{
            int y = fib(x-1)+fib(x-2);
            return y;
        }
        
    }
}