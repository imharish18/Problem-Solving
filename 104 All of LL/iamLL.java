import java.util.*;

class Node2{
    int val;
    Node2 next;
    public Object random;

    Node2(int val){
        this.val = val;
    }
}

class SLL{
    Node2 head;
    Node2 tail;
    int sz=0;

    public void spiralMatrix(int m, int n) {
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++){
                arr[i][j]=-1;
            }
            System.out.println();
        }

        Node2 traverse = head;

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
        Node2 slow = new Node2(val);
        if(head==null) head = tail = slow;
        else{
            slow.next = head;
            head = slow;
        }
        sz++;
    }

    public void insertAtEnd(int val){
        Node2 slow = new Node2(val);
        if(head==null) head = tail = slow;
        else{
            tail.next = slow;
            tail = slow;
        }
        sz++;
    }

    public void insertAt(int idx, int val){
        Node2 slow = new Node2(val);
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
        Node2 x = head;
        for(int i=1; i<idx; i++){
            x=x.next;
        }
        slow.next=x.next;
        x.next=slow;
        sz++;
    }

    public void display(){
        Node2 slow = head;

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

        Node2 slow = head;
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

        Node2 slow = head;
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
        
        Node2 slow = head;
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

        Node2 slow = head;
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
        Node2 slow = head;
        if (head.next == null) return;
        Node2 fast = head.next;

        while(fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
        }
        slow.next = slow.next.next;
        System.out.println(slow.val);
    }
    
    public void removeNthFromEnd(int k) {
        Node2 i = head;
        Node2 j = head;
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
        Node2 slow = head;
        while(slow.next!=null){
            if(slow.val==slow.next.val){
                slow.next = slow.next.next;
            }
            else slow=slow.next;
        }
    }
}
public class iamLL{
    public static void displayW(Node2 head){
        
        Node2 slow = head;
        while(slow!=null){
            System.out.print(slow.val+" ");
            slow=slow.next;
        }
        System.out.println();
    }
    public static Node2[] splitListToParts(Node2 head, int k) {
        ArrayList<Node2> arr = new ArrayList<>();
        int n = 0;
        Node2 temp = head;
        while(temp!=null){
            temp = temp.next;
            n++;
        }

        int size = n/k;
        int extra = n%k;
        temp = head;
        int len=1;

        while(temp!=null){
            int s=size;
            if(extra>0) s++;
            if(len==1) arr.add(temp);
            if(len==s){
                Node2 a = temp.next;
                temp.next=null;
                temp=a;
                len=1;
                extra--;
            }else{
                temp=temp.next;
                len++;
            }
        }
        for(int i=0; i<arr.size(); i++){
            displayW(arr.get(i));
        }
    return arr.toArray(new Node2[k]);
    }
    public static Node2 reverse(Node2 head){
        if (head == null || head.next == null) return head; 
        Node2 prev = null;
        Node2 curr = head;

        while (curr != null) {
            Node2 next = curr.next;
            curr.next = prev;
            prev = curr;        
            curr = next;          
        }
        return prev;
    }
    public static void reverseKGroup(Node2 head, int k) {
        if(k==1) return;
        Node2 dummy = new Node2(-1);

        Node2 d = dummy;
        Node2 back = head;
        Node2 temp = head;
        Node2 front = head;
        int len = 1;
        while(front!=null){
            if(len<k){
                front = front.next;
                len++;
            }else{
                len=1;
                temp=front;
                front=front.next;
                temp.next=null;
                reverse(back);
                d.next=temp;
                d=back;
                back.next=front;
                back=back.next;
            }
        }
        displayW(dummy.next);
       
    }


    public static void nodesBetweenCriticalPoints(Node2 head) {
        Node2 left = head, mid = head.next, right = head.next.next;
        int first = -1, last = -1, idx = 1;
        int minD=0;
        while(right!=null){
            if(mid.val<left.val && mid.val<right.val || mid.val>left.val && mid.val>right.val){
                if(first==-1) first = idx;
                minD = idx-last;
                last = idx;

            }
            idx++;
            left= left.next;
            mid = mid.next;
            right = right.next;
        }
        if(first==last) return;
        int maxD = last-first;
        System.out.println(minD+" " + maxD);
    }

    public static void main(String[] args) {
        SLL l1 = new SLL();
        l1.insertAtEnd(5);
        l1.insertAtEnd(2);
        l1.insertAtEnd(3);
        l1.insertAtEnd(4);
        l1.insertAtEnd(5);
        l1.display();
        nodesBetweenCriticalPoints(l1.head);
        l1.display();
    }
}

