import java.util.*;

public class iam102 {
        public static Node[] reverse(Node head){
        if (head == null || head.next == null) return new Node[]{head,null}; 
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
    public static void reverseKGroup(Node head, int k) {
        ArrayList<Node> al = new ArrayList<>();

        Node back = head;
        Node front = head;

        int len = 1;
        int counter = 0;
        while(front!=null){
            if(len==1) al.add(back);
            if(len<k){
                front = front.next;
                len++;
            }
            else{
                len=1;
                back = front.next;
                front.next = null;
                front = back;
                counter++;
            }
        }
        System.out.println(counter);
        Node dummy = new Node(-1);
        Node d = dummy;
        for(int i=0; i<counter; i++){
            Node[] res = reverse(al.get(i));
            d.next=res[0];
            d=res[1];
        }
        if(counter>0){
            d.next = back;
        }
    }
}
