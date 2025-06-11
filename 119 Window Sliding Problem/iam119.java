public class iam119 {
    public int maxSatisfied(int[] arr, int[] gru, int k) {
        int n = arr.length;
        int maxLoss = 0;
        int prevLoss = 0;

        for (int i = 0; i < k; i++) {
            if (gru[i] == 1) prevLoss += arr[i];
        }

        int maxIdx = 0;
        maxLoss = prevLoss;

        int i = 1, j = k;
        while (j<n) {
            int currLoss = prevLoss + (gru[j] == 1 ? arr[j] : 0) - (gru[i - 1] == 1 ? arr[i - 1] : 0);
            if (currLoss > maxLoss) {
                maxLoss = currLoss;
                maxIdx = i;
            }
            prevLoss = currLoss;
            i++;
            j++;
        }

        for (int x = maxIdx; x < maxIdx + k && x < n; x++) {
            gru[x] = 0;
        }

        int maxSatisfaction = 0;
        for (int x = 0; x < n; x++) {
            if (gru[x] == 0) maxSatisfaction += arr[x];
        }

        return maxSatisfaction;
    }
}
