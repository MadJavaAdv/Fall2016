package java112.demo;

import java.util.*;

/** A class to demonstrate lists, specifically, ArrayList
 *  @author pwaite
 */

public class ListDemo2 {

    /** Main method to demonstrate use of the List interface/ArrayList class
     *  @param args Parameters that are entered on the command line.
     */

    public static void main(String[] args) {

        // instantiate an arraylist
        List<String> myList = createList();

        System.out.println(myList);

        if (myList.contains("one")) {
            System.out.println("One is in the list");  
        }

        for (String myString : myList) {
            System.out.println(myString);

        }

        Set<String> mySet = new TreeSet<String>();
        
        mySet.add("one");
        mySet.add("one");
        mySet.add("two");
        mySet.add("three");

        System.out.println(mySet);

        if (mySet.contains("one")) {
            System.out.println("One is in the list");  
        }

        for (String myString : mySet) {
            System.out.println(myString);
        }
    }

    private static List<String> createList() {
        List<String> myList = new ArrayList<String>();


        myList.add("one");
        myList.add("one");
        myList.add("two");
        myList.add("three");
        return myList;
    }

}
