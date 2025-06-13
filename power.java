import java.util.Stack;

class power{
    public static void negNo2(int[] ar, int k) {
        Stack<Integer> st = new Stack<>();

        int n = ar.length;
        int ngi[] = new int[n];
        ngi[n-1] = n-1;
        st.push(n-1);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && ar[i]>ar[st.peek()]) st.pop();
            ngi[i] = st.isEmpty() ? i : st.peek();
            st.push(i);
        }
        for(int nn : ngi){
            System.out.print(ar[nn]+" ");
        }
        System.out.println();

        int[] ans = new int[n-k+1];
        for(int i=0; i<n-k+1; i++){

            int max = ar[i];
            int j=i;

            while(j<i+k){
                max = Math.max(max, ar[j]); 
                if (ngi[j] == j) break; 
                j = ngi[j]; 
            }
            ans[i]=max;
        }

        for(int nn : ans){
            System.out.print(nn+" ");
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] nums = {1,3,-1,-3,5,3,6,7};
        negNo2(nums, 3);
    }
}