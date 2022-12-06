public class RecursiveLinearSearch {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,15,16,1};
        int s =0;
        int target =19;
        System.out.println(check(arr,s,target));
    }
    public static boolean check(int []a,int s, int t)
    {
        if(s==a.length)
        {
            return false;
        }
        if(a[s]==t || check(a,s+1,t))
        {
            return true;
        }
        return false;
    }
    
}
