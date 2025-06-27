import java.util.*;
public class iam170 {
    public int lastStoneWeight(int[] ar) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int x : ar) pq.add(x);
        while(pq.size()>1){
            int last = pq.remove();
            int slast = pq.remove();
            if(last==slast) continue;
            else pq.add(last-slast);
        }
        if(pq.size()==0) return 0;
        return pq.remove();
    }
}

