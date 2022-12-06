public class SumofDigits {
    public static void main(String[] args) {
        int n = 1234;
        System.out.println(SumD(n));
    }
    public static int SumD(int n)
    {
        if(n==0)
        {
            return 0;
        }
        int sum =  0;
        sum = (n%10)+SumD(n/10);
        return sum;
    }
}
