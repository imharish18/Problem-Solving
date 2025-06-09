import java.util.Stack;
public class eww {
    public static void fx(int[] ar) {
        int n = ar.length;
        Stack<Integer> st = new Stack<>();
        int[] op = new int[n];
        op[n-1] = -1;
        st.push(ar[n-1]);
        System.out.println(st);
        for(int i=n-2; i>=0; i--){
            while(!st.isEmpty() && st.peek()<=ar[i]) st.pop();
            op[i] = st.isEmpty() ? -1 : st.peek();
            st.push(ar[i]);
        }
        for(int a: op){
            System.out.print(a+" ");
        }
        System.out.println();
            
    }
    public static void fx2(int[] ar) {
        int n = ar.length;
        Stack<Integer> st = new Stack<>();
        int[] op = new int[n];
        op[0] = -1;
        st.push(ar[0]);
        System.out.println(st);
        for(int i=1; i<n; i++){
            while(!st.isEmpty() && st.peek()<=ar[i]) st.pop();
            op[i] = st.isEmpty() ? -1 : st.peek();
            st.push(ar[i]);
        }
        for(int a: op){
            System.out.print(a+" ");
        }
        System.out.println();
            
    }

    public static void main(String[] args) {
        int[] ar = {4,2,3,4};
        fx2(ar);
    }
}

