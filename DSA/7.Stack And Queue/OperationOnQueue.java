import java.util.ArrayDeque;
import java.util.Queue;
public class OperationOnQueue{
    public static void main(String[] ars){
        //First in First Out = FIFO
        //Real Time Example => Queue for Ticket,Car Washing
        Queue<Integer> queue = new ArrayDeque<Integer>();   //Array Deque
        //Add
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(25);

        //get the front Element
        System.out.println(queue.peek());

        //Remove element
        System.out.println(queue.remove());

        System.out.println(queue.peek());

        //Size
        System.out.println(queue.size());
    }
}