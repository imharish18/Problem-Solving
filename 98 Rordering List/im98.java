public class im98 {
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
        Node temp = head.next;
        Node save = head;
        while(temp!=null){
            temp = reverse(temp);
            save.next = temp;
            temp=temp.next;
            save=save.next;
        }
    }
}
