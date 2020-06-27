ackage javaapplication1;
import java.util.*;

public class JavaApplication1 {

    public static void main(String[] args) {
        // TODO code application logic here

        Scanner s = new Scanner(System.in);
        Vector<Integer> v=new Vector<>(5);
        System.out.println("Initial Capacity " + v.capacity());
        v.add(2);
        v.addElement(3);
        v.add(3);
        v.add(2);
        v.add(4);
        v.add(3);
        System.out.println("Final Capacity " + v.capacity());
        System.out.println("Vector Size is " + v.size());
        System.out.print(v);
       

    }
    
}