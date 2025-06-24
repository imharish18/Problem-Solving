import java.util.*;
public class iam162 {
        // MY METHOD 1;
    public int[] findEvenNumbers(int[] digits) {
        ArrayList<Integer> ans = new ArrayList<>();
        int[] freq = new int[10];
        for (int num : digits) freq[num]++;
        for (int i = 100; i < 1000; i += 2) {
            int x = i;
            int c = x % 10; x /= 10;
            int b = x % 10; x /= 10;
            int a = x;

            int[] copy = freq.clone();

            if (copy[a]-- > 0 && copy[b]-- > 0 && copy[c]-- > 0) {
                ans.add(i);
            }
        }

        return ans.stream().mapToInt(x -> x).toArray();
    }
    // METHOD 2
    // public int[] findEvenNumbers(int[] digits) {
    //     ArrayList<Integer> ans = new ArrayList<>();
    //     HashMap<Integer, Integer> map = new HashMap<>();
    //     for (int num : digits) map.put(num, map.getOrDefault(num, 0) + 1);
        
    //     for (int i = 100; i < 1000; i=i+2) {
    //         int x = i;
    //         int c = x % 10; x /= 10;
    //         int b = x % 10; x /= 10;
    //         int a = x;
    //         if (map.containsKey(a)) {
    //             int aFreq = map.get(a);
    //             map.put(a, aFreq - 1);
    //             if (aFreq == 1) map.remove(a);

    //             if (map.containsKey(b)) {
    //                 int bFreq = map.get(b);
    //                 map.put(b, bFreq - 1);
    //                 if (bFreq == 1) map.remove(b);

    //                 if (map.containsKey(c)) {
    //                     int cFreq = map.get(c);
    //                     map.put(c, cFreq - 1);
    //                     if (cFreq == 1) map.remove(c);
    //                     ans.add(i);
    //                     map.put(c, cFreq);
    //                 }

    //                 map.put(b, bFreq);
    //             }
    //             map.put(a, aFreq);
    //         }
    //     }
    //     int[] ans2 = new int[ans.size()];
    //     for (int i = 0; i < ans.size(); i++) {
    //         ans2[i] = ans.get(i);
    //     }
    //     return ans2;
    // }
}
