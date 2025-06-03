public class iam86 {
        Node head;
    Node tail;
    int sz=0;

    public void insertAtStart(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            temp.next = head;
            head = temp;
        }
        sz++;
    }

    public void insertAtEnd(int val){
        Node temp = new Node(val);
        if(head==null) head = tail = temp;
        else{
            tail.next = temp;
            tail = temp;
        }
        sz++;
    }
    public void insertAt(int idx, int val){
        Node temp = new Node(val);
        if(idx==0){
            insertAtStart(val);
            return;
        }
        if(idx==sz){
            insertAtEnd(val);
            return;
        }
        if(idx>sz){
            System.out.println("Invalid Index!!");
            return;
        }
        Node x = head;
        for(int i=1; i<idx; i++){
            x=x.next;
        }
        temp.next=x.next;
        x.next=temp;
        sz++;
    }
}
