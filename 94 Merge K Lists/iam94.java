public class iam94 {
    public static void displayW(Node head){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }

    public static Node mergeTwoLists(Node list1, Node list2) {
        Node t1 = list1;
        Node t2 = list2;
        Node dummy = new Node(-1);
        Node t = dummy;
        while(t1!=null && t2!=null){
            if(t1.val<=t2.val){
                t.next=t1;
                t1=t1.next;
            }else{
                t.next=t2;
                t2=t2.next;
            }
            t=t.next;
        }
        if(t1==null) t.next = t2;
        else t.next=t1;
        return dummy.next;
    }
    public static Node mergelists(Node[] lists, int lo, int hi){
        if(lo==hi) return lists[lo];
        if(lo>hi) return null;

        int mid = lo+(hi-lo)/2;
        Node list1 = mergelists(lists, lo, mid);
        Node list2 = mergelists(lists, mid+1, hi);
        return mergeTwoLists(list1,list2);
    }
    public static void mergeKlists(Node[] lists){
        if(lists==null || lists.length==0) return;
        displayW(mergelists(lists, 0, lists.length-1));
    }
    public static void main(String[] args) {
        SLL l1 = new SLL();
        l1.insertAtEnd(1);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);

        SLL l2 = new SLL();
        l2.insertAtEnd(1);
        l2.insertAtEnd(3);
        l2.insertAtEnd(4);

        SLL l3 = new SLL();
        l3.insertAtEnd(2);
        l3.insertAtEnd(6);

        Node[] lists = {l1.head,l2.head,l3.head};

        l1.display();
        l2.display();
        l3.display();
        mergeKlists(lists);

    }
}
