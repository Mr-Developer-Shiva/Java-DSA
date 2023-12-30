
public class RemoveFirstInLinkedList {
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);

        n1.next = n2;
        n2.next = n3;
        n4.next = n4;
        n4.next = n5;

        Node head = n1;
        head = removeFirst(head);

        Node temp = head ;
        while(temp != null){
            System.out.println(temp.data + " ");
            temp = temp.next;
        }


    }
    //Main Logic
    public static Node removeFirst(Node head){

        if(head == null){
            return null;
        }
        head = head.next;
        return head;
    }

    public static class Node {
        int data;
        Node next ;

        Node(int val){
            this.data = val;
        }
    }
}
