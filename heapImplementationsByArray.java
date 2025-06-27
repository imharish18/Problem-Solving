class minHeap{
    int size;
    int[] ar;
    minHeap(int capacity){
        ar = new int[capacity];
    }
    public void swap(int p, int i){
        int temp = ar[i];
        ar[i]=ar[p];
        ar[p]=temp;
    }
    public void upheapify(int idx){
        if(idx==0) return;
        int p = (idx-1)/2;
        if(ar[p]>ar[idx]){
            swap(p,idx);
            upheapify(p);
        }
    }
    public void add(int num){
        ar[size] = num;
        upheapify(size);
        size++;
    }
    public int size(){
        return size;
    }
    public int peek(){
        if(size==0){
        System.out.println("Heap is EMPTY");
        return -1;
        }
        return ar[0];
    }
    
}
public class heapImplementationsByArray {
    public static void main(String[] args) {
        minHeap pq = new minHeap(5);
        pq.add(5);
        pq.add(0);
        pq.add(6);
        pq.add(4);
        pq.add(2);
        System.out.println(pq.peek());
    }
}
