interface A{
default void show()
{
    System.out.println("I am A");
}
}
interface B{
    default void show()
    {
        System.out.println("I am B");
    }
}
class C implements A,B{
    public void show()
    {
        B.super.show();
        // System.out.println("I am C");
    }
}
public class InheritanceinInterfaces {
    public static void main(String[] args) {
        C obj = new C();
        obj.show();//show function of Class C is called if there is no super in class C
    }
}
