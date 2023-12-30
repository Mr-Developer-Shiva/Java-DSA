import java.util.Stack;
public class OperationOnStack {
    public static void main(String[] args){
        //Last in First Out 
        //Real Time example => Plates in order by order will take the Last Plate
        Stack<Integer> stack = new Stack<>();
        //Add
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        //Peek => Get the Last Element Not Removed
        System.out.println(stack.peek());

        //Remove 
        System.out.println(stack.pop());

        System.out.println(stack.peek());

        //Size
        System.out.println(stack.size());
    }
}
