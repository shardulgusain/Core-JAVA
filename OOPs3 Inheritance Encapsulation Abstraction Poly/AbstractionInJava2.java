class A
{
    public void show(Integer i)//Integer i with Number i
    {
        System.out.println(i);
    }
    public void show(Double i)//Double i with Number i
    {
        System.out.println(i);
    }

}
public class AbstractionInJava2 {
    public static void main(String[] args) {
        A obj = new A();
        obj.show(5);//Prints 5
        obj.show(5.5);//Prints 5.5
        //what if i just want to print number i send irrespective of the type of number.
        //HENCE REPLACE the parameters in the methods as stated 
    }
}
