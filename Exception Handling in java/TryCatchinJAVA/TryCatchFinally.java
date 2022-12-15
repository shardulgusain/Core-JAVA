public class TryCatchFinally {
    public static void main(String[] args) {
        try {
            int i =9/0;
            // System.out.println("bye");
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println("exception h bhai ");
            //System.out.println("bye");
        }
        //why 2 bye instead use finally to implement DRY
        finally
        {
            System.out.println("bye");
        }
    }
}
