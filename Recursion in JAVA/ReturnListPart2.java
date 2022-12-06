import java.util.ArrayList;

public class ReturnListPart2 {
    public static void main(String[] args) {
        int [] arr = {1,2,3,4,10,15,19,19,16,1,19};
        int s =0;
        int target =19;
        
        System.out.println(search(arr,s,target));
    }
   public static ArrayList search(int []a, int s,int t)
   {
       ArrayList<Integer> arrr = new ArrayList<>();
       if(s == a.length)
       {
           return arrr;
       }
       //arrr = search(a,s+1,t);
       if(a[s]==t)
       {
           arrr.add(s);
          
       }
       arrr.addAll(search(a,s+1,t));
       return arrr;
       
   }
}
