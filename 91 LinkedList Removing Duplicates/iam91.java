public class iam91 {
class Node{
    int val;
    Node next;

    Node(int val){
        this.val = val;
    }
}

class SLL{
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
        if(idx>sz || idx<0){
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

    public void display(){
        Node temp = head;

        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }

    public int getElement(int idx){
        if(idx>sz || idx<0){
            System.out.println("Invalid Index");
            return -1;
        }
        if(idx==0) return head.val;
        if(idx==sz-1) return tail.val;

        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        return temp.val;
    }

    public void setElement(int idx, int val){
        if(idx>sz || idx<0){
            System.out.println("Invalid Index");

        }
        if(idx==0) head.val=val;
        if(idx==sz-1)tail.val = val;

        Node temp = head;
        for(int i=0; i<idx; i++){
            temp = temp.next;
        }
        temp.val=val;
    }

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
        tail=temp;
        temp.next = temp.next.next;
        sz--;

    }

    public void deleteAt(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==sz){
            deleteAtTail();
            return;
        }
        if(head==null){
            System.out.println("Linked List is Empty");
            return;
        }

        Node temp = head;
        for(int i=1; i<idx; i++){
            temp = temp.next;
        }
        if(temp.next==tail){
            tail=temp;
        }
        temp.next = temp.next.next;
        sz--;
    }

    public void size(){
        System.out.println("Size of the Linked List: "+sz);
    }

    public void findLeftMiddle() {
        Node slow = head;
        if (head.next == null) return;
        Node fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        System.out.println(slow.val);
    }
    
    public void removeNthFromEnd(int k) {
        Node i = head;
        Node j = head;
        int len = 0;
        while(i!=null){
            len++;
            i=i.next;
        }
        i=head;
        for(int x=0; x<k-1; x++){
            i=i.next;
        }
        for(int x=0; x<len-k; x++){
            j=j.next;
        }
        int temp = j.val;
        j.val = i.val;
        i.val = temp;
    }

    public void deleteDuplicates() {
        Node temp = head;
        while(temp.next!=null){
            if(temp.val==temp.next.val){
                temp.next = temp.next.next;
            }
            else temp=temp.next;
        }
    }
}
}
