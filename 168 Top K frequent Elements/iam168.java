import java.util.*;

public class iam168 {

    public class Pair implements Comparable<Pair>{
        int ele;
        int diff;
        Pair(int ele, int diff){
            this.ele = ele;
            this.diff = diff;
        }
        public int compareTo(Pair p){
            if(this.diff==p.diff) return this.ele - p.ele;
            return this.diff - p.diff;
        }
    }
    public int[] topKFrequent(int[] ar, int k) {
        int[] ans = new int[k];

        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : ar) map.put(x, map.getOrDefault(x, 0) + 1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int ele : map.keySet()) {
            int freq = map.get(ele);

            pq.add(new Pair(ele,freq));
            if (pq.size() > k) pq.remove();
        }

        for (int i=0; i<k; i++) {
            Pair p = pq.remove();
            ans[i] = p.ele;
        }
        return ans;
    }
}

