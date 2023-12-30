import java.util.*;
public class Heap{
    public static void main(String[] args) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder()); 
         //How to Priority was remove Changed use Parameter arguments (Collections.reverseOrder());

        //Put  - 0 (logn)   Priority was lowest Number...
        pq.add(30);
        pq.add(67);
        pq.add(29);
        pq.add(19);
        pq.add(55);
        pq.add(45);

        //remove  - 0(logn)
        System.out.println(pq.remove());
        System.out.println(pq.remove());

        //get - 0(1)
        System.out.println(pq.peek());
        System.out.println(pq.peek());

        //size
        System.out.println(pq.size());

    }
}