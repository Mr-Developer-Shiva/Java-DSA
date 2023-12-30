import java.util.*;
public class Intro_HashSet {
    public static void main(String[] args) {
        //Initialize
        HashSet<Integer> set = new HashSet<>();

        //add in HashMap
        set.add(10);
        set.add(20);
        set.add(30);
        set.add(40);
        set.add(50);

        //check whether a number is present or not
        System.out.println(set.contains(10));   // -> true
        System.out.println(set.contains(15));   // -> false

        //remove
        set.remove(10); // -> removed 10
        System.out.println(set.contains(10)); // -> Now 10 is false 

        //Size from HashMap
        System.out.println(set.size()); // => 4

        //No more Dublicate are Allowed
        set.add(20);
        System.out.println(set.size());
    }
}
