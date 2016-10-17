package java112.demo;

import java.util.*;

/** A class to demonstrate maps
 *  @author pwaite
 */

public class MapDemo {

    /** Main method to demonstrate use of the Treemap class to
     *  hold a sorted set of mapped data.
     *  @param args Parameters that are entered on the command line.
     */

    public static void main(String[] args) {

        // Instantiate a map that holds a String as the key and an Integer as the value
        Map<String, Integer> map = new TreeMap<String, Integer>();
        
        map.put("abc", 4);
        map.put("123", 5);
        map.put("def", 6);
        map.put("abc", 10);

        System.out.println(map);

        // use containsKey method to check for key in the map
        if (map.containsKey("123")) {
            System.out.println("The key 123 has the value of: " + map.get("123"));
        }
        
        System.out.println();

        for (Map.Entry<String, Integer> entry : map.entrySet()) {
            String key = entry.getKey();
            Integer value = entry.getValue();
            System.out.println(key + " => " + value);
        }



    }
}
