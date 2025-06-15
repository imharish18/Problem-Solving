import java.util.*;
class iam133 {
    public int[] deckRevealedIncreasing(int[] ar) {
        Arrays.sort(ar);
        int n = ar.length;
        int[] ans = new int[n];
        Queue<Integer> q = new ArrayDeque<>();
        for(int i=0; i<n; i++)q.add(i);

        for(int i=0; i<n; i++) {
        ans[q.remove()]=ar[i];
        if(!q.isEmpty())q.add(q.remove());
        }

        return ans;
    }
}

