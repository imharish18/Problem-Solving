public class iamon99 {
        public static Node reverse(Node head){
        if (head == null || head.next == null) return head; 
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;        
            curr = next;          
        }
        return prev;
    }
    public static void reorderList(Node head) {
        Node slow = head;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }


        fast = reverse(slow.next);
        slow.next=null;
        slow=head.next;
        Node temp = head;
        while(slow!=null && fast!=null){
            temp.next=fast;
            fast=fast.next;
            temp=temp.next;
            temp.next=slow;
            slow=slow.next;
            temp=temp.next;
        }
        if(slow==null){
            temp.next = fast;
        }else{
            temp.next = slow;
        }
    }
}
