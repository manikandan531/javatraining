package logical;

import java.util.*;

public class TreeMap1
{
    
    static Map<String, Integer> map = new HashMap<>();

    public static void sortbykey()
    {
        
        TreeMap<String, Integer> sorted = new TreeMap<>();
        sorted.putAll(map);
        for (Map.Entry<String, Integer> entry : sorted.entrySet())
         System.out.println("Key = " + entry.getKey() + ", Value = " + entry.getValue());
        
    }
    
    public static void main(String args[]) {
        
        map.put("Naveen", 80);
        map.put("Ragu", 90);
        map.put("Raja", 80);
        map.put("Mani", 75);
        map.put("Naveen", 80);
        
        sortbykey();
    }
}