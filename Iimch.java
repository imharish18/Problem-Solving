import java.util.*;

class Node{
    int val;
    Node next;
    public Object random;

    Node(int val){
        this.val = val;
    }
}
class SLL{
    Node head;
    Node tail;
    int sz=0;

    public void spiralMatrix(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=-1;
            }
            System.out.println();
        }

        Node traverse = head;

        int minR = 0, minC = 0, maxR = arr.length-1, maxC = arr[0].length-1;


        while(minR<=maxR && minC<=maxC && traverse!=null){
            for(int i = minC; i<=maxC; i++){
                arr[minR][i] = traverse.val;
                if(traverse.next==null) break;
                traverse = traverse.next;
            }
            minR++;
            if(minR>maxR || minC>maxC || traverse.next==null) break;

            for(int i = minR; i<=maxR; i++){
                arr[i][maxC] = traverse.val;
                traverse = traverse.next;
            }
            maxC--;
            if(minR>maxR || minC>maxC || traverse.next==null) break;
            
            for(int i = maxC; i>=minC; i--){ 
                arr[maxR][i] = traverse.val;
                traverse = traverse.next;
            }
            maxR--;
            if(minR>maxR || minC>maxC || traverse.next==null) break;

            for(int i = maxR; i>=minR; i--){ 
                arr[i][minC] = traverse.val;
                traverse = traverse.next;
            }
            minC++;
    }
    System.out.println("--------------------------------");
            for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }


    public void insertAtStart(int val){
        Node slow = new Node(val);
        if(head==null) head = tail = slow;
        else{
            slow.next = head;
            head = slow;
        }
        sz++;
    }

    public void insertAtEnd(int val){
        Node slow = new Node(val);
        if(head==null) head = tail = slow;
        else{
            tail.next = slow;
            tail = slow;
        }
        sz++;
    }

    public void insertAt(int idx, int val){
        Node slow = new Node(val);
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
        slow.next=x.next;
        x.next=slow;
        sz++;
    }

    public void display(){
        Node slow = head;

        while(slow!=null){
            System.out.print(slow.val+" ");
            slow = slow.next;
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

        Node slow = head;
        for(int i=0; i<idx; i++){
            slow = slow.next;
        }
        return slow.val;
    }

    public void setElement(int idx, int val){
        if(idx>sz || idx<0){
            System.out.println("Invalid Index");

        }
        if(idx==0) head.val=val;
        if(idx==sz-1)tail.val = val;

        Node slow = head;
        for(int i=0; i<idx; i++){
            slow = slow.next;
        }
        slow.val=val;
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
        
        Node slow = head;
        for(int i=1; i<sz-1; i++){
            slow = slow.next;
        }
        tail=slow;
        slow.next = slow.next.next;
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

        Node slow = head;
        for(int i=1; i<idx; i++){
            slow = slow.next;
        }
        if(slow.next==tail){
            tail=slow;
        }
        slow.next = slow.next.next;
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
        int slow = j.val;
        j.val = i.val;
        i.val = slow;
    }

    public void deleteDuplicates() {
        Node slow = head;
        while(slow.next!=null){
            if(slow.val==slow.next.val){
                slow.next = slow.next.next;
            }
            else slow=slow.next;
        }
    }
}

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

public class Iimch{
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


