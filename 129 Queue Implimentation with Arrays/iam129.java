
public class iam129 {
        int f = -1;
        int r = -1;
        int size;
        int[] ar;
        iam129(int size){
            ar = new int[size];
        }
        public boolean isFull(){
            return r==ar.length-1;
        }
        public boolean isEmpty(){
            return size==0;
        }
        public void add(int val){
            if(isFull()){
                System.out.println("QUEUE is full");
                return;
            }if(f==-1 && r==-1){
                f=r=0;
                ar[r]=val;
            }
            else ar[++r] = val;
            size++;
        }
        public int remove(){
            if(isEmpty()) {
                System.out.println("QUEUE is Empty");
                return -1;
            }else{
                size--;
                return ar[f++];
            }
        }
        public int peek(){
            if(isEmpty()) {
                System.out.println("QUEUE is Empty");
                return -1;
            }else{
                return ar[f];
            }
        }
        public void display(){
            if(isEmpty()) System.out.println("Queue is Empty");
            else{
                for(int i=f; i<=r; i++){
                    System.out.print(ar[i]+" ");
                }
                System.out.println();
            }
        }
}
