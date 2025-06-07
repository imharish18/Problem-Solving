class dNode{
    int val;
    dNode next;
    dNode prev;
    dNode(int val){
        this.val = val;
    }
}
class DLL{
    dNode head;
    dNode tail;
    int size;

    public void display(){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }System.out.println();
    }

    public void insertAtTail(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            tail.next = temp;
            temp.prev = tail;
            tail = temp;
        }
        
        size++;
    }
    public void insertAtHead(int val){
        dNode temp = new dNode(val);
        if(size==0) head = tail = temp;
        else{
            temp.next=head;
            head.prev = temp;
            head = temp;
        }
    }
    public void insertAt(int val, int idx) {
        if(idx==0){
            insertAtHead(val);
            return;
        }
        if(idx==size){
            insertAtTail(val);
            return;
        }
        if(idx>size){
            System.out.println("OUT OF BOUND");
            return;
        }
        dNode temp = new dNode(val);
        dNode x = head;
        for(int i=1; i<idx; i++){
            x = x.next;
        }
        dNode y = x.next;
        x.next = temp;
        y.prev = temp;
        temp.next = y;
        temp.prev = x;
        size++;
    }

    public void deleteAtHead() throws Error{
        if(size==0) throw new Error("List is Empty");
        head=head.next;
        head.prev = null;
        size--;
    }
    public void deleteAtTail() throws Error{
        if(size==0) throw new Error("List is Empty");
        tail=tail.prev;
        tail.next = null;
        size--;
    }
    public void deleteAt(int idx){
        if(idx==0){
            deleteAtHead();
            return;
        }
        if(idx==size-1){
            deleteAtTail();
            return;
        }
        dNode temp = head;
        for(int i=1; i<idx; i++){
            temp=temp.next;
        }
        temp.next = temp.next.next;
        temp=temp.next;
        temp.prev = temp.prev.prev;
        System.out.println(temp.val);
    }

    public void getHead(){
        if(head==null) System.out.println("Empty List");
        System.out.println(head.val);
    }
    public void getTail(){
        if(size==0) System.out.println("Empty List");
        System.out.println(tail.val);
    }
    public void getAt(int idx) throws Error{
        if(idx>=size) throw new Error("OUT OF BOUND");
        if(idx==0){
            getHead();
            return;
        }
        if(idx==size-1){
            getTail();
            return;
        }
        dNode temp = head;
        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        System.out.println(temp.val);
    }
    public void setHead(int newVal){
        if(head==null) System.out.println("Empty List");
        head.val=newVal;
    }
    public void setTail(int newVal){
        if(size==0) System.out.println("Empty List");
        tail.val=newVal;
    }
    public void setAt(int idx, int newVal) throws Error{
        if(idx>=size) throw new Error("OUT OF BOUND");
        if(idx==0){
            setHead(newVal);
            return;
        }
        if(idx==size-1){
            setTail(newVal);
            return;
        }
        dNode temp = head;
        for(int i=0; i<idx; i++){
            temp=temp.next;
        }
        temp.val=newVal;
    }

}

public class iamdll105{
    public static void display(dNode head){
        dNode temp = head;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void displayReverse(dNode tail){
        dNode temp = tail;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.prev;
        }
        System.out.println();
    }
    public static void displayWithRandomNode(dNode node){
        dNode temp = node;
        while(temp.prev!=null){
            temp = temp.prev;
        }
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp = temp.next;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        DLL list = new DLL();
        list.insertAtTail(10);
        list.insertAtTail(20);
        list.insertAtTail(40);
        list.insertAtTail(50);
        list.insertAt(30,2);
        list.display();
        list.setHead(1);
        list.setTail(5);
        list.setAt(1,2);
        list.setAt(2,3);
        list.setAt(3,4);
        list.display();

        System.out.println(list.size);

    }
}
