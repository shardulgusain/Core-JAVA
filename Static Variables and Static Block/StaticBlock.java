//static bloc help us initiate static variables.
class Human
{
    static String Creator;
    static String Planet;
    static
    {
        Creator = "God";
        Planet = "Earth ";
    }//static block runs exactly once as the class loads.


}
public class StaticBlock {
    public static void main(String[] args) {
        System.out.println(Human.Creator);
        System.out.println(Human.Planet);
    }
}
