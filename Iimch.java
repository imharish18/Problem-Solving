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

    
}
public class Iimch{
    public static void main(String[] args) {
        SLL list = new SLL();
        list.insertAtStart(2);
        list.insertAtStart(3);
        list.insertAtStart(4);
        list.insertAtStart(7);
        list.insertAtStart(8);
        list.insertAtStart(9);
        list.insertAtEnd(5);

        list.display();
        list.size();
        list.deleteAtTail();
        list.display();
        list.size();
        System.out.println(list.tail.val);

        
    }
}


