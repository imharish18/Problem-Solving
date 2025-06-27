import java.util.*;
public class iam169 {
    class Solution {
    public class Pair implements Comparable<Pair> {
        int ele;
        int freq;
        Pair(int ele, int freq) {
            this.ele = ele;
            this.freq = freq;
        }
        public int compareTo(Pair p) {
            if (this.freq == p.freq) return p.ele - this.ele;
            return this.freq - p.freq;
        }
    }

    public int[] frequencySort(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int x : nums) map.put(x, map.getOrDefault(x, 0) + 1);

        PriorityQueue<Pair> pq = new PriorityQueue<>();
        for (int x : map.keySet()) {
            pq.add(new Pair(x, map.get(x)));
        }
        int i = 0;
        while (!pq.isEmpty()) {
            Pair p = pq.poll();
            for (int j = 0; j < p.freq; j++) {
                nums[i++] = p.ele;
            }
        }
        return nums;
    }
}

}
