import java.util.*;
public class iam165 {
        public Nodee22 deepCopy(Nodee22 head){
        Nodee22 head2 = new Nodee22(head.val);
        Nodee22 t1 = head.next;
        Nodee22 t2 = head2;
        while(t1!=null){
            Nodee22 temp = new Nodee22(t1.val);
            t2.next = temp;
            t2 = t2.next;
            t1 = t1.next;
        }
        return head2;
    }
    public Nodee22 copyRandomList(Nodee22 head) {
        if(head==null) return null;
        HashMap<Nodee22,Nodee22> map = new HashMap<>();
        Nodee22 ans = deepCopy(head);
        Nodee22 t1 = head;
        Nodee22 t2 = ans;

        while(t1!=null){
            map.put(t1,t2);
            t1=t1.next;
            t2=t2.next;
        }
        for(Nodee22 ori : map.keySet()){
            Nodee22 dup = map.get(ori);
           // if(ori.random!=null) dup.random = map.get(ori.random);
        }
        return ans;
    }
}
