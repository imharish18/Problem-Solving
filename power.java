import java.util.*;
public class power {
    public static void pushAtBottom(int val, Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0) temp.push(st.pop());
        st.push(val);
        while(temp.size()!=0) st.push(temp.pop());
    }
    public static void pushAt(int idx, int val, Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()>idx) temp.push(st.pop());
        st.push(val);
        while(temp.size()!=0) st.push(temp.pop());
    }
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st);
        pushAtBottom(5,st);
        System.out.println(st);
        pushAt(2,15,st);
        System.out.println(st);


    }
}
