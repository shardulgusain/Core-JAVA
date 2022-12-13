package Demo;
/**
 * Demo
 */
class A{
    class B
    {

    }
}
public class Demo {

    public static void main(String[] args) {
        A a = new A();
       // B b = new B();//throws error as B says that it has a upper class hence need object of the same to initiate its object
       A.B b = a.new B();//Inside a  and then call to contructor of B is made
       System.out.println(b);
        
    }
}