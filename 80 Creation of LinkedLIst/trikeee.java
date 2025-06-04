public class trikeee{
        public static void main(String[] args) {
            Node a = new Node(10);
            Node b = new Node(20);
            Node c = new Node(30);
            Node d = new Node(40);
            Node e = new Node(50);
            Node f = new Node(60);
            a.next = b;
            a.next.next = c;
            a.next.next.next = d;
            a.next.next.next.next = a;
            System.out.println(a);
            System.out.println(b);
            System.out.println(c);
            System.out.println(d);
            System.out.println(e);
            System.out.println(f);
        }
    
}
