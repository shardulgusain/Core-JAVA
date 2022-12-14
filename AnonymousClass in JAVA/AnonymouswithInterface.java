/**
 * I
 */
interface I {
void show();
    
}
public class AnonymouswithInterface {
    public static void main(String[] args) {
        //Object of interface is not possible
        I obj = new I() {
            public void show()
            {
                System.out.println("I am anonymous class object implementing interface");
            }
        };
        obj.show();
    }
}
