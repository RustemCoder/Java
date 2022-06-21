import java.util.HashMap;
public class MyClass {
    public static void main(String args[]) {
      
      HashMap<Integer,Integer> hashMap = new HashMap<>();
      hashMap.put(1,1);
      
      for(Integer x: hashMap.keySet()){
          System.out.println(x);
      }
      
    }
}
