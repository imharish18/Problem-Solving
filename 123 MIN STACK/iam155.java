import java.util.Stack;
class MinStack2 {

    Stack<Integer> st = new Stack<>();
    Stack<Integer> helper = new Stack<>();
    public MinStack2() {
        
    }
    
    public void push(int val) {
        st.push(val);
        if(helper.isEmpty() || val<helper.peek()) helper.push(val);
        else helper.push(helper.peek());
    }
    
    public void pop() {
        st.pop();
        helper.pop();
    }
    
    public int top() {
        return st.peek();
    }
    
    public int getMin() {
        return helper.peek();
    }
public class iam155 {
    public static void main(String[] args) {
        
    }
}

/**
 * Your MinStack object will be instantiated and called as such:
 * MinStack obj = new MinStack();
 * obj.push(val);
 * obj.pop();
 * int param_3 = obj.top();
 * int param_4 = obj.getMin();
 */
}
