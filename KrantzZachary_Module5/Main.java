import java.util.*;

public class Main {
    public static void main(String[] args) {

        /*

        Collections is a class that can have objects created of its type.
        It holds many methods that allow developers to work with Collection types.

        Collection is an interface that does not have objects created, it serves to be a framework for classes that will implement the interface.
        Rather than having the functionality built in it just specifies what must be had by classes who want to be a Collection.


         */

        ArrayList<String> names = new ArrayList<String>(Arrays.asList("Emily","Adam","Grant","Hank","Charles","Bob","Dan","Frank"));

        System.out.println("Unsorted Names:");
        for(String s : names) {
            System.out.println(s);
        }

        Collections.sort(names);

        System.out.println("\nSorted names:");
        for(String s : names) {
            System.out.println(s);
        }

        Collections.shuffle(names);

        System.out.println("\nShuffled names:");
        for(String s : names) {
            System.out.println(s);
        }

        System.out.println("\nFind Adam: " + names.indexOf("Adam"));
        System.out.println("\nFind Zach" + names.indexOf("Zach"));

        System.out.println("\ntoArray():");
        Object[] names2 = names.toArray();
        for(Object s : names2) {
            System.out.println(s);
        }

        System.out.println("\nasList():");
        ArrayList<Object> names3 = new ArrayList<Object>(Arrays.asList(names2));
        for(Object s : names3) {
            System.out.println(s);
        }
    }
}