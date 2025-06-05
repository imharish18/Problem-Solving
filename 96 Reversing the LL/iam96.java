public class iam96 {
    public static void reverse(Node head){
    if (head == null || head.next == null) return;

    Node prev = null;
    Node curr = head;

    while (curr != null) {
        Node next = curr.next;  // save next node
        curr.next = prev;       // reverse link
        prev = curr;            // move prev forward
        curr = next;            // move curr forward
    }
    }
}
