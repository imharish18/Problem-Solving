public class iam88 {
    Node head;
    Node tail;
    int sz;

    public void deleteAtHead(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        head=head.next;
        sz--;
    }

    public void deleteAtTail(){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }
        
        Node temp = head;
        for(int i=1; i<sz-1; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        sz--;

    }

    public void deleteAt(int idx){
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }

        temp.next = temp.next.next;
        sz--;
    }
}
