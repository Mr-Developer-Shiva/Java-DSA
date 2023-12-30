import java.util.PriorityQueue;

public class KthLargestElement{
    public static void main(String[] args) {
        /*If You have been given an array and an 
         * integer K.Find the largest K element.
         * 
         */
        int[] arr = {10 ,7 ,1, 2, 3, 13 ,4 , 6};
        largestElement(arr,3);
        
    }
    public static void largestElement(int[] arr,int k){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        int i = 0 ;
        while(i < k){
            pq.add(arr[i]);
            i++;
        }

        while(i < arr.length ){
            if(arr[i] > pq.peek()){
                pq.remove();
                pq.add(arr[i]);
            }else{
                //Do nothing
            }
            i++;
        }

        while(pq.size() > 0){
            System.out.println(pq.remove());
        }
    }
}