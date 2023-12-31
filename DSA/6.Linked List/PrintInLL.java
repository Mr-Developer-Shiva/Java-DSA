public class PrintInLL{
    public static void main(String[] args){
        Node n1 = new Node(10);
        Node n2 = new Node(20);
        Node n3 = new Node(30);
        Node n4 = new Node(40);
        Node n5 = new Node(50);
        Node n6 = new Node(60);

        n1.next = n2 ;
        n2.next = n3 ;
        n3.next = n4 ;
        n4.next = n5 ;
        n5.next = n6 ;

        Node head = n1 ;

        printInLL(head);
    }

    public static void printInLL(Node head){
        while(head != null){
            System.out.println(head.data);
            head = head.next;
        }
    }
    public static class Node{
        int data;
        Node next ;
        Node(int val){
            this.data = val;
        }
    }
}