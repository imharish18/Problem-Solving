import java.util.*;

public class iam166 {

    public String kthLargestNumber(String[] nums, int k) {
        PriorityQueue<String> pq = new PriorityQueue<>((a, b) -> {
            if (a.length() != b.length()) return b.length() - a.length();
            return b.compareTo(a);
        });
        for (String num : nums){
            pq.add(num);
        }
        for (int i = 1; i < k; i++) pq.remove();
        return pq.remove();
    }
}

