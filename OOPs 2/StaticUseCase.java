//Conclusion:- To run  a static method we dont need an object, we can call the static method without creating the object of that class where method is declared.
//Conclusion2:- non static method cannot be called from static method without object initialization
//Conclusion3:- Static methods could be called from non static or static methods. i.e without creating objects or with objects.
//This vs Static:- we cannot use this inside static methods as this is replaced with objects and in static methods they are not dependent on objects.
//Conclusion:- As the static variables, functions are bind to class , so when we call a static method via object, it runs as static is bid to class and object is of class, whereas
//non static methods are bind to objects hence they need objects to execute.
class Human{
  String name;
  static int population;
  Human(String naam)
  {
    name = naam;
    population+=1;
  }
}
public class StaticUseCase {
    public static void main(String[] args) {//this is a static function hence we are running it without creating object of the class
        Human H = new Human("Shardul");
        Human H1 = new Human("Gusain");
        System.out.println(H1.population);//work fine but is not correct way use the below method to access static variables
        System.out.println(Human.population);//Correct way as static means they are class dependent not object.
        // greet();//this will not run  as greet function depends upon the object or it needs an object to execute
        StaticUseCase S = new StaticUseCase();
        S.greet(); //THIS WILL run smoothly
        S.Hola();//This will also run smoothly as this is internally breakdown into the next line code.
        StaticUseCase.Hola();//This is how static elements are bind to class name rather than  objects
    }
    public void greet()
    {
        System.out.println("namaste");
    }
    public static void Hola()
    {
        System.out.println("Hola I am static method");
    }
}
