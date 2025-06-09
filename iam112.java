import java.util.Stack;
public class iam112 {
    public static void calculcate(int[] price, int[] ans, int n){
        Stack<Integer> st = new Stack<>();
        ans[0] = 1;
        st.push(0);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && price[st.peek()]<price[i]) st.pop();
            if(st.isEmpty()) ans[i] = i+1;
            else ans[i] = i - st.peek();
            st.push(i);
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
        System.out.println();
    }
    
    public static void nextGreaterElementUsingStack(int[] ar, int[] ans, int n){
        Stack<Integer> st = new Stack<>();
        ans[n-1] = -1;
        st.push(ar[n-1]);
        for(int i = n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=ar[i]) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(ar[i]);
        }
    }

    public static void previousGreaterElementUsingStack(int[] ar, int[] ans, int n){
        Stack<Integer> st = new Stack<>();
        ans[0] = -1;
        st.push(ar[0]);

        for(int i=1; i<n; i++){
            while(!st.isEmpty() && ar[i]>st.peek()) st.pop();
            ans[i] = st.isEmpty() ? -1 : st.peek();
            st.push(ar[i]);
        }
    }

    public static void nextGreaterElement(int[] ar){
        int[] ans = new int[ar.length];
        int n = ar.length;

        for(int i=0; i<n; i++){
            ans[i]=-1;
            for(int j=i+1; j<n; j++){
                if(ar[i]<ar[j]){
                    ans[i]=ar[j];
                    break;
                }
            }
        }
        for(int a : ans){
            System.out.print(a+" ");
        }
    }
    public static void main(String[] args) {
        int[] nums = {3,1,2,5,4,6,2,3};
        int n = nums.length;
        int[] ans = new int[n];
        for(int a : nums){
            System.out.print(a+" ");
        }
        System.out.println();
        previousGreaterElementUsingStack(nums, ans, n);
        for(int a : ans){
            System.out.print(a+" ");
        }
        System.out.println();
    }
}
