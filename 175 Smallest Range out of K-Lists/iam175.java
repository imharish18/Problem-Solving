import java.util.*;
public class iam175{
    public static class Triplet implements Comparable<Triplet>{
        int ele;
        int row;
        int col;
        public Triplet(int e, int r, int c){
            this.ele = e;
            this.row = r;
            this.col = c;
        }
        public int compareTo(Triplet t){
            return this.ele-t.ele;
        }
    }
    public static int[] smallestRange(List<List<Integer>> nums) {
        PriorityQueue<Triplet> pq = new PriorityQueue<>();
        int[] ans = {0,Integer.MAX_VALUE};

        int k = nums.size();
        int max = Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            int ele = nums.get(i).get(0);
            pq.add(new Triplet(ele, i, 0));
            max = Math.max(max, ele);
        }
        while(true){
            Triplet top = pq.remove();
            int ele = top.ele;
            int row = top.row;
            int col = top.col;
            if(max-ele<ans[1]-ans[0]){
                ans[0]=ele;
                ans[1]=max;
            }
            if(nums.get(row).size()-1==col) break;
            int next = nums.get(row).get(col+1);
            pq.add(new Triplet(next, row, col+1));
            if(next>max) max = next;
        }
        return ans;
    }
}