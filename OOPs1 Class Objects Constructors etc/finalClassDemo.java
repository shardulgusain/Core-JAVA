

final class Demo
{
int l =10;
}
// class Demo1 extends Demo{
// //This class cannot extends parent class as the parent class in stated as final.
// }
public class finalClassDemo {
    public static void main(String[] args) {
        Demo D = new Demo();//Default contructor will run to inititate object
        System.out.println(D.l);
    }
}
