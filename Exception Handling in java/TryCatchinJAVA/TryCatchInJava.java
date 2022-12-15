/**
 * TryCatchInJava
 */
public class TryCatchInJava {

    public static void main(String[] args) {
       // int i =9/0;
       // System.out.println(i);//Arithmetic eception is thrown;
        try{
            int i =9/0;
            System.out.println(i);

        }
        catch(Exception e)
        {
            System.out.println("Exception h bhai");
        }
    }
}