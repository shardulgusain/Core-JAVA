/**
 * ConstructorInheritance
 */
class Human
{
 Human()
 {
    System.out.println("I am Human");
 }
}
class Male extends Human
{
    Male()
    {
        super();//if not it is by default
        System.out.println("I am male");
    }
}
public class ConstructorInheritance {

    public static void main(String[] args) {
        Male Shardul = new Male();
        //so by default the subclass constructor has the super method in it and it will call parent class or base class

    }
}