//we have two types of polymorphism 1 Method overloading and other is overriding
//Method overriding

/**
 * JavaPolymorphism
 */
class Shape{
    int l ; int b;
    Shape()
    {

    }
    Shape(int x ,int y )
    {
        this.l = x;
        this.b =y;

    }
    public static  void name()
    {
        System.out.println("I am shape");
    }
}
class Square extends Shape{
    Square()
    {
        super(5,5);
    }
    public static void name()
    {
        System.out.println("I am square");
    }

}
class Rectangle extends Shape
{
    Rectangle()
    {
        super();
        this.l =58;
        this.b = 88;
    }
    public static void name()
    {
        System.out.println("I am rectangle");
    }
}
public class JavaPolymorphism {

    public static void main(String[] args) {
        Rectangle R = new Rectangle();
        R.name();
        //R.name();//name function of rectangle is called 
        Shape S = new Rectangle();//Ref is telling us which variable or function it refers to if ref is of type shape then inside shape class the function name will execute .
        System.out.println(S.l);//Length of rectangle object is called
        S.name();//name function of shape is called though the object is of type rectangle. because the function is static and is called by class ref.
        //Conclusion is ....REF variable checks for the variables inside its classes.4
    }
}