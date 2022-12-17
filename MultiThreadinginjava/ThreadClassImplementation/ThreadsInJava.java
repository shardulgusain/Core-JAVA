/**
 * ThreadsInJava
 */
class Hi extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("Hi");
            try{Thread.sleep(100);}catch(Exception e){};
        }
    }

}
class Hello extends Thread
{
    public void run()
    {
        for(int i =0;i<5;i++)
        {
            System.out.println("Hello");
            try{Thread.sleep(100);}catch(Exception e){};
        }
    }
}
public class ThreadsInJava {

    public static void main(String[] args) {
        //all the execution is done by main thread
        Hi obj = new Hi();
        Hello obj1= new Hello();
        obj.start();
        
        obj1.start();

    }
}