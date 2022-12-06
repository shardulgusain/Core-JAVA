//Class Student
// class Student{
// String name;
// int Rno;
// int [] marks = new int[3];
// Student(String n, int rNo, int []m)//Constructor
// {
//     //This here refers to the object that is calling the constructor the class
//  this.name = n;
//  this.Rno = rNo;
//  this.marks = m;
// }
// }
public class OOPs1 {
    public static void main(String[] args) {
        //Object of Class Student
        Student S = new Student("Shardul", 46, new int[]{1,2,3});
        System.out.println(S.marks[2]);
        Student S1 = new Student("Gusain", 88, new int[]{8,9,10});
        System.out.println(S1.marks[1]);
        final int a =10;
        //a =16;//Throws a compile time error as the primitive is declared as final it cant be reassigned
        System.out.println(a);
        //Object as final
        final Student S2 = new Student("Kabali", 100, new int[]{4,5,6});
        System.out.println(S2.name);
        //S2 = S1;//cannot be reassigned
        S2.name = "Don";
        System.out.println(S2.name);
        //Cannot reassign objects but can assign their values as they are not final.
       
    }
    
}
