package ClassObjectsDefaultContructor;
class Student 
{
    int rno;
    String name;
}
public class Demo {
    public static void main(String[] args) {
        Student S = new Student();
        System.out.println(S.rno);
        //The object is instansiated as the default constructor is automaticaaly invoked.
        System.out.println(S.name);
    }
}
