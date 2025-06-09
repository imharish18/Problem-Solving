import java.util.Stack;
public class Stack106 {
        public static void pushAt(int idx, int val, Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx) temp.push(st.pop());
        st.push(val);
        while(temp.size()!=0) st.push(temp.pop());
    }
}
