class iam130{
    int val;
    iam130 next;
    iam130 prev;
    iam130(int val){
        this.val=val;
        this.next = null;
        this.prev = null;
    }
}
class deque{
    iam130 front;
    iam130 rear;
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
        iam130 newNode = new iam130(val);
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
        iam130 newNode = new iam130(val);
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
        iam130 temp = front;
        while(temp!=null){
            System.out.print(temp.val+" ");
            temp=temp.next;
        }
        System.out.println();
    }
    
}

