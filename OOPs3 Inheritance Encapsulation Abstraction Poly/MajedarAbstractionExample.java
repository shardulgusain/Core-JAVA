abstract class Writer
{
    public abstract void write();
}
class Pen extends Writer
{
    public void write()
    {
        System.out.println("Pen is writing");
    }
}
class Pencil extends Writer
{
    public void write()
    {
        System.out.println("Pencil is writing");
    }
}
class Kit extends Writer
{
    public void doSomething(Writer p)
    {
        p.write();
    }
    // public void doSomething(Pencil p)
    // {
    //     p.write();
    // }
    //alternative to this.why similar method 
}
public class MajedarAbstractionExample {
    public static void main(String[] args) {
        Kit k = new Kit();
        Writer P = new Pen();
        Writer Pe = new Pencil();
        k.doSomething(P);
        k.doSomething(Pe);

    }
}
