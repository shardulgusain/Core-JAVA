package Demo1;
class A
{
    static class B{

    }
}
public class Demo1 {
    public static void main(String[] args) {
        A obj = new A();//success
        //B obj1 = new B();//failed as this means B is independent of A and that is not the case.
        //Instead follow this
        A.B obj1 = new A.B();//HERE A.new B() is not needed as it does not depend upon object of A.;
        System.out.println(obj1);

    }
}
