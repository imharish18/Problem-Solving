public class iam115 {
    public static void main(String[] args) {
        int[] ar = {1,2,3,4};
        int n = ar.length;


        int[] pre = new int[n];
        int[] suf = new int[n];

        pre[0] = 1;
        for (int i = 1; i < n; i++) {
            pre[i] = pre[i - 1] * ar[i - 1];
        }

        suf[n - 1] = 1;
        for (int i = n - 2; i >= 0; i--) {
            suf[i] = suf[i + 1] * ar[i + 1];
        }

        for(int i=0; i<ar.length; i++){
            ar[i] = suf[i]*pre[i];
        }
    }
}
