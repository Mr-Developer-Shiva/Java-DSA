import java.util.*;
public class ReverseFirstKElementsOfQueue{
    public static void main(String[] args) {
        Queue<Integer> queue = new ArrayDeque<Integer>();
        //Input => 10, 20, 30, 40, 50, 60, 70
        //Output =>30, 20, 10, 40, 50, 60, 70 
        queue.offer(10);
        queue.offer(20);
        queue.offer(30);
        queue.offer(40);
        queue.offer(50);
        queue.offer(60);
        queue.offer(70);

        reverse(queue,3);
        for(Integer list : queue){
        System.out.println(list);
        }
        
    }
    public static void reverse(Queue<Integer> queue,int k){
        Stack<Integer> stack = new Stack<>();

        for(int i =0 ; i < k ;i++){
            stack.push(queue.remove());
        }

        for(int i = 0 ; i < k ;i++){
            queue.offer(stack.pop());
        }

        int count = queue.size() - k ;

        for(int i = 0 ; i < count ;i++){
            queue.offer(queue.remove());
        }
    }   
}