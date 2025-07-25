public class Basic {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data = data;
        }
    }

    public static void main(String[] args) {
        Node a = new Node(2);
//        System.out.println(a.data);
        Node b = new Node(3);
        a.next = b;
        Node c = new Node(8);
        b.next = c;
        Node d = new Node(7);
        c.next = d;
        Node e = new Node(8);
        d.next = e;
//        System.out.println(e.next);
        DisplayLLRec(a);
//        System.out.println();

    }
    public static void DisplayLL(Node head){
        while (head != null){
            Node temp = head;
            System.out.print(temp.data+" ");
            head = temp.next;
        }
        System.out.println();
    }
    public static void DisplayLLRec(Node head){
        if(head == null){
            return;
        }
        System.out.println(head.data);
        DisplayLLRec(head.next);

    }
}
