/**
 * AbstraclassImplementation
 */
//Abstraction is just inheritance but in abstraction we are reducing a overhead of runtime polymorphism.

abstract class Box{
    int l = 15;
    abstract void area();
    //abstract method means we are allowing child to inherit and describe this
    
}
class Square extends Box
{
    int b;
    Square(int  x)
    {
        this.b = x;
    }
    void area()
    {
        System.out.println("I am sqquare area");
    }
}

public class AbstraclassImplementation {

    public static void main(String[] args) {
        Square S = new Square(10);
        System.out.println(S.l);
        S.area();
        System.out.println(S.b);

    }
}