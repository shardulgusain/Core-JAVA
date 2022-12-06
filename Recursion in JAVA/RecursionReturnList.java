import java.util.ArrayList;

public class RecursionReturnList {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,15,19,19,16,1};
        int s =0;
        int target =19;
        ArrayList<Integer> ar = new ArrayList<>();
        System.out.println(find(arr,s,target,ar));

    }
    public static ArrayList find(int []a, int start, int t,ArrayList<Integer>arrr)
    {
        if(start == a.length)
        {
            return arrr;
        }
        if(a[start]== t)
        {
            arrr.add(start);
        }
        find(a,  start+1,t,arrr); 
        return arrr;
    }
    
}
