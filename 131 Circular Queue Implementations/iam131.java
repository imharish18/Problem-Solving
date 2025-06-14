class iam131{
    int front = -1;
    int rear = -1;
    int size;
    int[] ar;
    iam131(int size){
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

