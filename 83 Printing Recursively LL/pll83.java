class Node{
    public static final String left = null;
    public static final String right = null;
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

public class pll83{
    public static void printLinked(Node head){
        if (head==null) return;
        System.out.println(head.val);
        printLinked(head.next);
    }
    public static void main(String[] args) {
        Node a = new Node(10);
        Node b = new Node(20);
        Node c = new Node(30);
        Node d = new Node(40);
        Node e = new Node(50);
        Node f = new Node(60);

        a.next = b;
        b.next = c;
        c.next = d;
        d.next = e;
        e.next = f;

        Node head = a;
        printLinked(head);
    }
}
