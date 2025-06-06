import java.util.*;
public class iamon101 {
        public static Node[] splitListToParts(Node head, int k) {
        ArrayList<Node> al = new ArrayList<>();
        int len = 0;
        Node temp = head;
        while(temp!=null){
            temp = temp.next;
            len++;
        }
        temp = head;

        for(int i=0; i<len%k; i++){
        Node dummy = new Node(-1);
        Node d = dummy;
            for(int j=0; j<len/k+1; j++){
                System.out.print(j+" ");
                d.next = temp;
                temp = temp.next;
                d=d.next;
            }
            d.next=null;
            al.add(dummy.next);
        }
        for(int i=0; i<k-len%k; i++){
            Node dummy = new Node(-1);
            Node d = dummy;
            for(int j=0; j<len/k; j++){
                System.out.print(j+" ");
                d.next = temp;
                temp = temp.next;
                d=d.next;
            }
            d.next=null;
            al.add(dummy.next);
        }
        System.out.println(al);
        return al.toArray(new Node[k]);
    }
}
