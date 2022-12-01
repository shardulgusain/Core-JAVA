/**
 * InnerVSouterClass
 */
//Conclusion :- You can make innerclass static but not outer one . Think about it It really makes no sense.
public class InnerVSouterClass {
    static class Inner {
        static String name;

        public static void greet(String naam) {
            name = naam;
            System.out.println(name);
        }

    }

    public static void main(String[] args) {
        Inner I = new Inner();
        I.greet("Shardul");
        Inner.greet("shardul");

    }
}
