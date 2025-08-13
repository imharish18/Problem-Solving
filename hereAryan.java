import java.util.*;
import java.util.Stack;

public class hereAryan {
    public static void work(int[] ar){
        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();
        int n = ar.length;
        int[] res = new int[n];
        Stack<Integer> st = new Stack<>();
        for(int i=n-1; i>=0; i--){
            while (!st.isEmpty() && st.peek()<=ar[i]) {
                st.pop();
            }
            res[i]=st.isEmpty() ? -1 : st.peek();
            st.push(ar[i]);

        }
        for(int x : res){
            System.out.print(x+" ");
        }
    }
    public static void main(String[] args) {
        int[] ar1 = {1,3,4,2};
        work(ar1);

    }
}
