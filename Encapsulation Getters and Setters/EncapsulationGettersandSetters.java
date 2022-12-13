/**
 * EncapsulationGettersandSetters
 */
// Encapsulation is basically making our data private to the users and allowing them to access it via functions
class Human
{
    private String name;
    public void setName(String naam)
    {
        name = naam;
    }
    public String getName()
    {
        return this.name;
    }
}
public class EncapsulationGettersandSetters {

    public static void main(String[] args) {
        Human H = new Human();
        H.setName("shardul");
        //System.out.println(H.name);//this will not work 
        System.out.println(H.getName());
        
    }
}