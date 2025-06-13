import java.util.Stack;
class MinStack {
    Stack<Long> st = new Stack<>();
    long min;

    public MinStack() {
        min = Long.MAX_VALUE;
    }

    public void push(int val) {
        long value = (long) val;
        if (st.isEmpty()) {
            st.push(value);
            min = value;
        } else if (value >= min) {
            st.push(value);
        } else {
            st.push(2 * value - min);
            min = value;
        }
    }

    public void pop() {
        if (st.peek() < min) {
            min = 2 * min - st.peek();
        }
        st.pop();
    }

    public int top() {
        if (st.peek() < min) {
            return (int) min;
        }
        return (int) (long) st.peek();
    }

    public int getMin() {
        return (int) min;
    }
}

public class iam213 {
    public static void main(String[] args) {
        
    }
}
