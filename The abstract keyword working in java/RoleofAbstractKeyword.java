/**
 * RoleofAbstractKeyword
 */
//abstract keyword comes with class and methods
//no object of abstract class
abstract class Human
{
    public abstract void talk();
 public void walk()
 {
    System.out.println("Human is walking");
 }
}
class Male extends Human{
    //the subclass of abstract class must override the abstract  methods
 @Override
 public void talk()
 {
    System.out.println("Male is talking");
 }
}
class Female extends Human{
    @Override
    public void talk()
    {
        System.out.println("Female is talking");
    }
}
public class RoleofAbstractKeyword {

    public static void main(String[] args) {
        Male M = new Male();
        M.talk();//the function is overriding the abstract function
        Female F = new Female();
        F.talk();//the function is overriding the abstract function
        Human Shardul = new Male();
        //M.walk();//we cannot access this method so to access the method is illustrated below
        Shardul.walk();//this will print human is walking
    }
}