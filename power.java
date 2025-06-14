import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

class Qnode{
    int val;
    Qnode next;
    Qnode prev;
    Qnode(int val){
        this.val=val;
        this.next = null;
        this.prev = null;
    }
}
class deque{
    Qnode front;
    Qnode rear;
    int size;

    deque(){
        front=rear=null;
        size=0;
    }

    boolean isEmpty(){
        return size==0;
    }
    int size(){
        return size;
    }
    public void insertAtFront(int val){
        Qnode newNode = new Qnode(val);
        if(front==null){
            rear=newNode;
            front=newNode;
        }
        else{
            newNode.next=front;
            front.prev = newNode;
            front = newNode;
        }
        size++;
    }
    void insertAtRear(int val){
        Qnode newNode = new Qnode(val);
        if(rear==null){
            rear=front=newNode;
        }else{
            newNode.prev=rear;
            rear.next=newNode;
            rear=newNode;
        }
        size++;
    }
    void deleteFront(){
        if(size==0) System.out.println("Underflow");
        else{
            front=front.next;
            if(front==null) rear=null;
            else front.prev=null;
            size--;
        }
    }
    void deleteRear(){
        if(size==0) System.out.println("Underflow");
        else{
            rear=rear.prev;
            if(rear==null) front=null;
            else rear.next=null;
            size--;
        }
    }
    int getFront(){
        if(size==0) return -1;
        else return front.val;
    }
    int getRear(){
        if(size==0) return -1;
        else return rear.val;
    }
    void display(){
        Qnode temp = front;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}
class cqa{
    int front = -1;
    int rear = -1;
    int size;
    int[] ar;
    cqa(int size){
        ar = new int[size];
    }

    boolean isEmpty(){
        return size==0;
    }

    void add(int val){
        if(size==ar.length){
            System.out.println("isFull");
            return;
        }else if(size==0){
            front = rear = 0;
            ar[0]=val;
        }else if(rear<ar.length-1){
            ar[++rear] = val;
        }else if(rear==ar.length-1){
            rear=0;
            ar[0]=val;
        }
        size++;
    }
    int remove(){
        if(size==0){
            System.out.println("isEmpty");
            return -1;
        }else {
            int val =  ar[front];
            if(front==ar.length-1) front=0;
            else front++;
            size--;
            return val;
        }
    }
    int peek(){
        if(size==0){
            System.out.println("isEmpty");
            return -1;
        }else return  ar[front];   
    }
    void display(){
        if(size==0) return;
        else if(front<=rear){
            for(int i=front; i<=rear; i++){
                System.out.print(ar[i]+" ");
            }
        }else{
            for(int i=front; i<ar.length; i++){
                System.out.print(ar[i]+" ");
            }
            for(int i=0; i<=rear; i++){
                System.out.print(ar[i]+" ");
            }
            System.out.println();
        }
    }
}



public class power {
    public static void reverseQueue(Queue q, int k){
        Stack<Integer> st = new Stack<>();
        for(int i=0; i<k; i++) st.push((int)q.remove());
        while(!st.isEmpty()) q.add(st.pop());
        for(int i=0; i<q.size()-k; i++)  q.add(q.remove());
    }
    public static int countStudents(int[] st, int[] sd) {
        Queue q = new ArrayDeque();
        for(int a : st) q.add(a);
        int i=0;
        int count=0;
        while(!q.isEmpty() && count!=q.size()){
            if((int)q.peek()==sd[i]){
                count=0;
                q.remove();
                i++;
            }else{
                q.add(q.remove());
                count++;
            }
        }
        return q.size();
    }
    public static void firstNegative(int[] ar, int k){
        Queue q = new ArrayDeque<>();
        int n = ar.length;
        int[] ans = new int[n-k+1];

        for(int i=0; i<n; i++){
            if(ar[i]<0) q.add(i);
        }
        int i=0;
        while(i+k<=n){
            while(!q.isEmpty() && i>(int)q.peek()) q.remove();
            if(q.isEmpty() || (int)q.peek()>=i+k)ans[i]=0;
            else ans[i] = ar[(int)q.peek()];
            i++;
        }
        for(int l:ans){
            System.out.print(l+" ");
        }
    }
    
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        Deque dq = new ArrayDeque<>();
        int n = nums.length;
        int idx=0;
        int[] ans  = new int[n-k+1];
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && nums[i]>nums[(int)dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
            while((i-k+1)>(int)dq.peekFirst()) dq.removeFirst();
            if(i>=k-1) ans[idx++]=nums[(int)dq.peek()];
        }

        System.out.println(dq);
        for(int x: ans){
            System.out.print(x+" ");
        }
        return ans;
    }
    
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        int k = 3;
        maxSlidingWindow(nums, k);
    }
}
