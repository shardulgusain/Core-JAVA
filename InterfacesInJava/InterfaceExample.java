/**
 * InterfaceExample
 */
interface A{
    void show();
}
class B implements A{
    public void show()
    {
        System.out.println("I am in class B");
    }
}
public class InterfaceExample {

    public static void main(String[] args) {
        B obj = new B();
        obj.show();
    }
}