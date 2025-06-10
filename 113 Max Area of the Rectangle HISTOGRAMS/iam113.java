import java.util.Stack;
public class iam113 {
    public static int[] nse(int[] ar){
        int n = ar.length;
        int[] ans = new int[n];
        Stack<Integer> st = new Stack<>();

        ans[n-1] = n;
        st.push(ar[n-1]);

        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && ar[st.peek()]>=ar[i]) st.pop();
            ans[i] = st.isEmpty() ? n : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static int[] pse(int[] ar){
        Stack<Integer> st = new Stack<>();
        int n = ar.length;
        int[] ans = new int[n];

        ans[0] = -1;
        st.push(ar[0]);


        for(int i=1; i<n; i++){
            while(!st.isEmpty() && ar[st.peek()]>=ar[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(i);
        }
        return ans;
    }
    public static void largerstRectangleInHistogram(int[] ar,int[] pse,int[] nse){
        int maxArea = Integer.MIN_VALUE;
        for(int i=0; i<ar.length; i++){
            maxArea = Math.max(maxArea, ar[i]*(nse[i]-pse[i]-1));
            System.out.println(ar[i]*(nse[i]-pse[i]-1) +" for "+ ar[i]);
        }
        System.out.println("THe max area will be "+maxArea);
    }
    public static void main(String[] args) {
        int[] ar = {2,1,5,6,2,3};
        for(int a : ar){
            System.out.print(a+" ");
        }
        System.out.println();
        int[] nse = nse(ar);
        int[] pse = pse(ar);
        largerstRectangleInHistogram(ar,pse,nse);

    }
}
