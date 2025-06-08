import java.util.*;
class Stack{
    int size;
    int top=-1;
    int[] st;

    void Stack(int size){
        this.size = size;
        st = new int[size];
    }

    public void push(int val){
        if(top==size) System.out.println("Space is Full");
        else if(top++==-1) st[0] = val;
        else{
            top++;
            st[top]=val;
        }
    }

}

public class power {
    public static void pushAtBottom(int val, Stack<Integer> st){
        Stack<Integer> temp = new Stack<>();
        while(st.size()!=0) temp.push(st.pop());
        st.push(val);
        while(temp.size()!=0) st.push(temp.pop());
    }


    public static void displayRecursive(Stack<Integer> st){
        if(st.isEmpty()) return;
        int val = st.pop();
        displayRecursive(st);
        System.out.println(val);

    }
    public static void main(String[] args) {

    }
}
