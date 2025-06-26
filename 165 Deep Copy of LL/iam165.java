import java.util.*;
public class iam165 {
        public Node deepCopy(Node head){
        Node head2 = new Node(head.val);
        Node t1 = head.next;
        Node t2 = head2;
        while(t1!=null){
            Node temp = new Node(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
    public Node copyRandomList(Node head) {
        if(head==null) return null;
        HashMap<Node,Node> map = new HashMap<>();
        Node ans = deepCopy(head);
        Node t1 = head;
        Node t2 = ans;

        while(t1!=null){
            map.put(t1,t2);
            t1=t1.next;
            t2=t2.next;
        }
        for(Node ori : map.keySet()){
            Node dup = map.get(ori);
           // if(ori.random!=null) dup.random = map.get(ori.random);
        }
        return ans;
    }
}
