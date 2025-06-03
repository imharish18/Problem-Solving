class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){ 
        this.val = val; 
    }
    ListNode(int val, ListNode next){ 
        this.val = val; this.next = next; 
    }
}
public class linkedlistsolving {
    public ListNode middleNode(ListNode head) {
        ListNode temp = head;
        int len=0;
        while(temp!=null){
            temp=temp.next;
            len++;
        }
        len=len/2+1;
        temp = head;
        for(int i=0; i<len-1; i++){
            temp=temp.next;
        }
        return temp;
    }
}
