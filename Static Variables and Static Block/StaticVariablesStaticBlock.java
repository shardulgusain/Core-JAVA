/**
 * StaticVariables&StaticBlock
 */
//as we know class is loaded during compile time by jvm and object at runtime.
//Now if we dont want our variables , methods to be bind with objects then just make them static.
class Male
{
    static int malePopulation=0;
    //This variable is not bind to the object now it is staic means static binding means bind to the class
    //and resolved during compile time.
    Male()
    {
        malePopulation++;
    }
    static void myname(String naam)
    {
        System.out.println("My name is Male class"+naam);
    }
}
public class StaticVariablesStaticBlock {

    public static void main(String[] args) {
        Male Shardul = new Male();
        System.out.println(Male.malePopulation);
        Male Kabali = new Male();
        System.out.println(Male.malePopulation);
        Male.myname("shardul");
        Kabali.myname("kabali");//accessible as objects can call static as well as non static methods, whereas non static cannot be called without objects.
        }
}