import java.util.Scanner;

class Node{
    int data;
    Node next;
    Node(int data){
        this.data = data;
    }
}
public class Basic1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Node n1 = new Node(5);
        Node n2 = new Node(6);
        n1.next = n2;
        Node n3 = new Node(8);
        n2.next = n3;
        Node n4 = new Node(10);
        n3.next = n4;
        Node n5 = new Node(20);
        n4.next = n5;
        Display(n1);
    }
    public static void Display(Node a){
        Node temp = a;
        while(temp != null){
            System.out.print(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void InsertAtStart(int a){
        Node temp = new Node(a);
//        if()

    }
}
