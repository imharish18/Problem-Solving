import java.util.*;
class MedianFinder {
    PriorityQueue<Integer> minHeap = new PriorityQueue<>();
    PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
    public MedianFinder() {
    }
    
    public void addNum(int num) {
        if(maxHeap.size()==0) maxHeap.add(num);
        else{
            if(num<maxHeap.peek()) maxHeap.add(num);
            else minHeap.add(num);
        }
        //Balancing 
        if(maxHeap.size()==minHeap.size()+2){
            minHeap.add(maxHeap.remove());
        }
        if(minHeap.size()==maxHeap.size()+2){
            maxHeap.add(minHeap.remove());
        }
    }
    
    public double findMedian() {
        if(maxHeap.size()>minHeap.size()) return maxHeap.peek();
        if(maxHeap.size()<minHeap.size()) return minHeap.peek();
        return (maxHeap.peek()+minHeap.peek())/2.0;
    }
}

