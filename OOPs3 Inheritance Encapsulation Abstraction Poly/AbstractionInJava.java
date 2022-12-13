/**
 * AbstractionInJava
 */
abstract class Human//we can't make object of abstract class
{
 public abstract void walk();
 public void talk()
 {
    System.out.println("Human is talking");
 }
}
class Men extends Human{
    public void walk()
    {
        System.out.println("Men is walking");
    }
}
class Women extends Human{
public void walk()
{
    System.out.println("women is walking");
}
}

public class AbstractionInJava {

    public static void main(String[] args) {
        Men M = new Men();
        M.walk();//Men is walking
        Human H = new Women();
        H.walk();//Women is walking
        H.talk();
    }
}