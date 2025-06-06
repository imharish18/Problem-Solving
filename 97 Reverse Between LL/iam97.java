public class iam97 {
        public static Node[] reverse(Node head){
        if (head == null || head.next == null) return new Node[]{head}; 
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;         
            curr = next;          
        }
        return new Node[]{prev,head};
    }

    public static Node reverseBetween(Node head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;

        Node a=null, b=null, c=null, d=null;
        Node temp = head;

        int pos = 1;

        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;
            temp = temp.next;
            pos++;
        }
        if(a!=null) a.next = null; 
        if(c!=null)c.next = null;
        reverse(b);
        if(a!=null) a.next = c; 
        b.next = d;
        if(a==null) return c;
        return head;
    }
}
