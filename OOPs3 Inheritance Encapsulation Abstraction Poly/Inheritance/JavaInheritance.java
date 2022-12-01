/**
 * JavaInheritance
 */
//Conclusion:- we could make refernce of parent class pointing to the object of child class and the ref variable defines the properties and methods object could have access to.

class Box
{
    int l ;
    int b;
    int h ;
    Box(int x ,int y ,int z)
    {
        this.l = x;
        this.b = y;
        this.h = z;

    }

}
class Boxweight extends Box
{
    int weight;
    Boxweight(int w)
    {
        super(5,6,7);//this calls the contructor of the parent class
        this.weight= w;
    }
}
public class JavaInheritance {

    public static void main(String[] args) {
        Boxweight B = new Boxweight(15);
        System.out.println(B.weight);
        System.out.println(B.l);
        Box B1 = new Boxweight(15);
        //System.out.println(B1.weight);//Error cannot access this as ref variable is of type box
        System.out.println(B1.l);
        //System.out.println(B1.weight);
        Boxweight B2 = new Boxweight(80);
        //B2 = B1;//Error as B1 is of type Box whereas B2 is of type boxweight hence no conversion.
        System.out.println(B2.weight);
    }
}