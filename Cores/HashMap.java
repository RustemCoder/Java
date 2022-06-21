import java.util.HashMap;
public class MyClass {
    public static void main(String args[]) {
    
    HashMap<Integer,Integer> hashMap = new HashMap<>();
    hashMap.put(1,20);
      
      for(Integer x: hashMap.keySet()){
          System.out.println(x);
      }
      
    System.out.println(hashMap.get(1));
        
    
    // remove a value by a key 
    System.out.println(hashMap.remove(1));
    System.out.println("Size of hashMap is " + hashMap.size());
    
    // To remove all items
    hashMap.clear();
    
    }
}
