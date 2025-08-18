import java.util.*;
public class iam198 {
        public List<List<Integer>> threeSum(int[] ar) {
        List<List<Integer>> ans = new ArrayList<>();
        Arrays.sort(ar);
        int n = ar.length;

        for (int i = 0; i < n - 2; i++) {
            if (i > 0 && ar[i] == ar[i - 1]) continue;

            int j = i + 1;
            int k = n - 1;

            while (j < k) {
                int sum = ar[i] + ar[j] + ar[k];

                if (sum > 0) {
                    k--;
                } else if (sum < 0) {
                    j++;
                } else {
                    ans.add(Arrays.asList(ar[i], ar[j], ar[k]));
                    j++;
                    k--;
                    while (j < k && ar[j] == ar[j - 1]) j++;
                    while (j < k && ar[k] == ar[k + 1]) k--;
                }
            }
        }
        return ans;
    }
}
