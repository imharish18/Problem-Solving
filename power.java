
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
     public static void main(String[] args) {
        cqa q = new cqa(5);
        q.display();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);
        System.out.println(q.size);
        q.remove();
        q.remove();
        q.remove();
        q.add(6);
        q.add(7);
        q.add(8);

        
        
        q.display();

    }
}
