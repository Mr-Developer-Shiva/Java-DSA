import java.util.*;
public class Remove_Even_Numbers {
    public static void main(String[] args) {
        /*Q)Write an algorithm to remove all the even numbers from
         * the given ArrayList
         * 
         * EX: list = {5,10,4,15,8,21,3,2} 
         *      (After Removal)
         *      list{5,15,21,3}
        */
        ArrayList<Integer> list = new ArrayList<>();
        //add
        list.add(5);list.add(10);list.add(4);list.add(15);
        list.add(8);list.add(21);list.add(3);list.add(2);

        RemoveEven(list);
        System.out.println(list);
     }
 
    //Main logic 
    public static void RemoveEven(ArrayList<Integer> list){
        for(int i =list.size() - 1 ; i >= 0 ;i--){
            if(list.get(i) % 2 ==  0){
                list.remove(i);
            }
        }
      
    }
}
