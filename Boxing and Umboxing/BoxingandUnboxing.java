/**
 * BoxingandUnboxing
 */
public class BoxingandUnboxing {

    public static void main(String[] args) {
        int i =5;
        Integer k = i;//k is an object
        
        System.out.println(k);
        int u = k.intValue();
        System.out.println(u);
        String str = "453";//this is an string object 
        int q = Integer.parseInt(str);//Inside the Integer class there is an static method parseInt
        System.out.println(q);
    }
}