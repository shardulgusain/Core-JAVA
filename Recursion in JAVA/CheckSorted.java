public class CheckSorted {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,15,16,1};
        int s =0;
        int s1 =1;
        System.out.println(check(arr,s,s1));
    }
    public static boolean check(int []a,int x,int y)
    {
        if(y==a.length)
        {
            return true;
        }
        if(a[x]<a[y] && check(a,x+1,y+1))
        {
            return true;
        }
        else{
            return false;
        }
    }
}
