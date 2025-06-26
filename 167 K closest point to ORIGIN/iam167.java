import java.util.*;

public class iam167 {
    public int[][] kClosest(int[][] points, int k) {
            PriorityQueue<int[]> pq = new PriorityQueue<>((a,b)->{
            double distA = a[0]*a[0] + a[1]*a[1];
            double distB = b[0]*b[0] + b[1]*b[1];
            return Double.compare(distB, distA);
        });
        for (int[] x : points){
            pq.add(x);
            if(pq.size()>k) pq.remove();
        }
        int[][] res = new int[k][2];
        while(!pq.isEmpty()) res[--k] = pq.remove();
        return res;
    }
}

