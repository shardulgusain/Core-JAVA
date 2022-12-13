class Student 
{
    String name;
    int rno;
    Student(String naam)
    {
        this.name = naam;
    }
}
public class finalKeywordObjectDemo {
    public static void main(String[] args) {
        final Student S = new Student("shardul");
        Student S1 = new Student("Gusain");
        S.name = S1.name;
        System.out.println(S.name);//Yes the name is changed.
       // S= S1;//This will not execute as you cannot reassign.
        System.out.println(S.name);//
        // System.out.println(S.name+ " "+ S1.name);
        // final int A =10;
        // A =0;
        // System.out.println(A);//Error cant be modified.
    }
}
