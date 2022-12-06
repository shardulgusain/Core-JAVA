public class EasyRecursion {
    public static void main(String[] args) {
        int n =5;
       // Printt(n);//Print 1 to N
        //printt(n);//print N to 1
        //To print boyh
        PrintBoth(n);
    }
        public static void PrintBoth(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            System.out.println(1);
            return;
        }
    
        System.out.println(n);
        PrintBoth(n-1);
        System.out.println(n);
        
    }
    
    
    public static void Printt(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
        Printt(n-1);
        System.out.println(n);
    }
    public static void printt(int n)
    {
        if(n==1)
        {
            System.out.println(1);
            return;
        }
    
        System.out.println(n);
        printt(n-1);
    }
}
