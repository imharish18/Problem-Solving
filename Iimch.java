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
public class Iimch{
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
        ArrayList<Node> hs = new ArrayList<>();

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


