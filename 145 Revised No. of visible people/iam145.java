
public class iam145 {

    public int[] canSeePersonsCount(int[] ar) {
        int n = ar.length;
        int[] ans = new int[n];
        int[] stack = new int[n]; 
        ans[n-1] = 0;
        stack[0] = ar[n-1];
        int top = 0;

        for (int i = n - 2; i >= 0; i--) {
            int count = 0;
            while (top >= 0 && stack[top] < ar[i]) {
                top--;
                count++;
            }
            if (top >= 0) count++;
            ans[i] = count;
            stack[++top] = ar[i];
        }

        return ans;
    }
}
