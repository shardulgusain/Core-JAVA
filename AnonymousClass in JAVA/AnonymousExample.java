/**
 * AnonymousExample
 */
class Box{
    public void show()
    {
        System.out.println("Hello I am Box");
    }
}
public class AnonymousExample {

    public static void main(String[] args) {
        Box B = new Box()
        {     
            public void show()
            {
                System.out.println("Hello I am anonymous class and I am running");
            }
        };
        B.show();
        System.out.println(B);
    }
}