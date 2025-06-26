import java.util.*;

public class power {

    public static void work(int[] ar, int k){
        int n = ar.length;
        PriorityQueue<Integer> pq = new PriorityQueue<>();
        for(int i =0; i<n; i++){
            pq.add(ar[i]);
            if(pq.size()>k){
                ar[i-k]=pq.remove();
            }
        }
        while (pq.size()!=0) {
            ar[n-k]=pq.remove();
            k--;
        }

        for(int x : ar){
            
            System.out.print(x+" ");
        }

    }


    public static void kClosest(int[][] points, int k) {
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
}

    public static void main(String[] args) {
        int[] ar = {6,5,3,2,8,10,9};
        int k = 3;

        work(ar,k);





    }
}
