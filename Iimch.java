import java.util.*;

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
public class Iimch{
    public static void displayW(Node head){
        
        Node slow = head;
        while(slow!=null){
            System.out.print(slow.val+" ");
            slow=slow.next;
        }
        System.out.println();
    }
    public static Node[] reverse(Node head){
        if (head == null || head.next == null) return new Node[]{head}; 
        Node prev = null;
        Node curr = head;

        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;         
            curr = next;          
        }
        return new Node[]{prev,head};
    }

    public static Node reverseBetween(Node head, int left, int right) {
        if(head==null || head.next==null || left==right) return head;

        Node a=null, b=null, c=null, d=null;
        Node temp = head;

        int pos = 1;

        while(temp!=null){
            if(pos==left-1) a = temp;
            if(pos==left) b = temp;
            if(pos==right) c = temp;
            if(pos==right+1) d = temp;
            temp = temp.next;
            pos++;
        }
        if(a!=null) a.next = null; 
        if(c!=null)c.next = null;
        reverse(b);
        if(a!=null) a.next = c; 
        b.next = d;
        if(a==null) return c;
        return head;
    }
    public static void main(String[] args) {
        SLL l1 = new SLL();
        l1.insertAtEnd(1);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.insertAtEnd(6);
        l1.insertAtEnd(7);
        l1.insertAtEnd(8);
        l1.insertAtEnd(9);

        l1.display();
        reverseBetween(l1.head, 3,6);
        l1.display();

    }
}


