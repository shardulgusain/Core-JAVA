class Demo
{
    private static Demo Obj ;
    private Demo()
    {
    
    }
    public static Demo makeObj()
    {
        if(Obj==null)
        {
            Obj = new Demo();
        }
       
            return Obj;
        
    }
}
public class SingletonClass {
    public static void main(String[] args) {
        Demo D = Demo.makeObj();
        System.out.println(D.toString());
        Demo D1 = Demo.makeObj();
        System.out.println(D1.toString());
        System.out.println(D==D1);
        
    }
}
