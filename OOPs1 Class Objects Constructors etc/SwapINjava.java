public class SwapINjava {
    public static void main(String[] args) {
        int a = 10;
        int b=20;
        swap(a,b);
        System.out.println(a+" "+ b);//No swappign as in java the primitives are pass by value i.e only value is passed.
        int []arr1 = new int[]{1,2,3};
        int []arr2 = new int[]{4,5,6};
        System.out.println(arr1.toString());
        // System.out.println(arr2.toString());
        SWAP(arr1,arr2);
        System.out.println(arr1[0]);//the original object is changed hence java is not pass by reference as swap doesnt reflex here.if it would have pass by ref then swap must have swapped the variables.hence java is pass by value of the ref variable that is pass by object value we can say.
        System.out.println(arr1.toString());
        Swap(arr1[0],arr1[1]);
        System.out.println(arr1[0]+" " +arr1[1]);//No swap
    }
    public static void swap(int x, int y)
    {
        int temp =y;
        y =x;
        x = temp;
    }
    public static void Swap(int x, int y)
    {
        int temp =y;
        y =x;
        x = temp;
    }
    public static void SWAP(int []x, int []y)
    {
        int []temp = y;
        y =x;
        x =temp;
        y[0]=10;
        System.out.println(x.toString());//swap happens here pass by value of ref variable.
    }
}
