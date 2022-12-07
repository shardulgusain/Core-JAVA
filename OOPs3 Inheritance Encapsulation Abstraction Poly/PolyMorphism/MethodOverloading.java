//In java polymorphism is achieved via method overloading and overriding lets see how overloading work
class Box{
    int l;
    Box(int x)
    {
        this.l =x;
    }
    void area()
    {
        System.out.println("i am area1");
    }
    void area(String name)
    {
        System.out.println(" I am area 2 of"+ name);
    }
}
public class MethodOverloading {
    public static void main(String[] args) {
        Box B = new Box(10);
        B.area();
        B.area("Box");
        //Both the function has same name but definition is different
    }
    
}
