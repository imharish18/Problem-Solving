import java.util.Stack;
public class iam114 {
    public static int[] canSeePersonsCount(int[] ar) {
        int[] ans = new int[ar.length];
        Stack<Integer> st = new Stack<>();
        ans[ar.length-1] = 0;
        st.push(ar[ar.length-1]);

        for(int i=ar.length-2; i>=0; i--){
            int count = 0;
            while(!st.isEmpty() && st.peek()<ar[i]){
                st.pop();
                count++;
            }
            if(!st.isEmpty()) count++;
            ans[i] = count;
            st.push(ar[i]);
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
        return ans;
    }
    public static void main(String[] args) {
        int[] ar = {10,6,8,5,11,9};
        canSeePersonsCount(ar);
    }
}
