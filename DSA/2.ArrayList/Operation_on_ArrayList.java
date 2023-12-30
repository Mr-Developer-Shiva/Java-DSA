import java.util.*;
public class Operation_on_ArrayList {
    public static void main(String[] args){
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list);
        //add at index 
        list.add(0,50);
          System.out.println(list);
        //get
        System.out.println(list.get(1));
        //set 
        list.set(3,50); 
         System.out.println(list.get(3));
        //remove 
        list.remove(3);
        System.out.println(list);

        //size
        System.out.println(list.size());
    }
}
