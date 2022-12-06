public class BinarySearchRecursion {
    public static void main(String[] args) {
        int [] arr = {1,4,5,6,7,9,10,11,14,16,18,20,25,27,29,35,37,38,40};
        int target =45;
        int s = 0;
        int e = arr.length-1;
        System.out.println(BS(arr,target,s,e));
    }
    public static int BS(int[] a, int t, int s, int e)
    {
        if(s>e)
        {
            return 0;
        }
       int mid = (s+e)/2;
       if(a[mid]==t)
       {
           return mid; //tail recursion
       }
       else if(a[mid]<t)
       {
           s= mid+1;
           return BS(a, t, s, e);// not tail recursion
       }
       else
       {
           e = mid-1;
           return BS(a, t, s, e);
       }
       

    }
}
