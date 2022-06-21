import java.util.HashMap;
import java.util.Map;
public class MyClass {
    public static void main(String args[]) {
    
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    hashMap.put(1,20);
      
      for(Integer x: hashMap.keySet()){
          System.out.println(x);
      }
      
    System.out.println(hashMap.get(1));
        
    // Iterate the map using
    // for-each loop
    for (Map.Entry<Integer, Integer> e : hashMap.entrySet())
            System.out.println("Key: " + e.getKey()
                               + " Value: " + e.getValue());
    // remove a value by a key 
    System.out.println(hashMap.remove(1));
    System.out.println("Size of hashMap is " + hashMap.size());
    
    // To remove all items
    hashMap.clear();
    
    }
}
