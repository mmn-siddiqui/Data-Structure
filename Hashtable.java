
package hashtable;

import java.util.Hashtable;


public class HashTable {

    
    public static void main(String[] args) {
       Hashtable<Integer,Integer> htable = new Hashtable<Integer,Integer>();
       
       htable.put(12, 1234);
       htable.put(13, 5678);
       htable.put(8, 9123);
      // htable.put(12, 0);
       htable.put(2, 0);
       htable.remove(2);
        System.out.println("Value exist? = "+htable.containsValue(1234));
        System.out.println("Key Exist? = " +htable.containsKey(8));
        
        for(Integer x:htable.keySet()){
            System.out.println("Values against : " + x + " is " + htable.get(x));
        }
        System.out.println("Size of HashTable is = "+htable.size());
    }
    
}
