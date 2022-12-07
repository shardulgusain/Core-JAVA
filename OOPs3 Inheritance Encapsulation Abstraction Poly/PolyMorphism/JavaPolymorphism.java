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
        // Shape S = new Shape();
        // System.out.println(S.l);
        // S.name();
        Rectangle R= new Rectangle();
        R.name();//this will override the shape method in shape class.
        //we cannot override static methods because static method are bind with class and object cannot override static methods/

    }
}