import java.util.*;
class Stack{
    int size;
    int top;
    int[] st;

    Stack(int size){
        this.size = size;
        st = new int[size];
        top=-1;
    }
    public boolean isEmpty(){
        if(top==-1) return true;
        else return false;
    }
    public boolean isFull(){
        if(top==size-1) return true;
        else return false;
    }
    public void push(int val){
        if(top==size-1){
            System.out.println("Space is Full");
            return;
        }
        if(top==-1){
            top=0;
            st[top]=val;
        }else{
            st[top+1] = val;
            top++;
        }
    }
    public int pop(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{
            int val = st[top];
            st[top] = 0;
            top--;
            return val;
        }
        return -1;
    }
    public int peek(){
        if(top==-1){
            System.out.println("Stack is Empty");
        }else{;
            return st[top];
        }
        return -1;
    }
    public int size(){
        return top+1;
    }
    public String toString(){
        if(top==-1) return "Stack is Empty";
        StringBuilder sb = new StringBuilder();
        for(int i=0; i<size; i++){
            sb.append(st[i]+" ");
        }
        return "[ "+sb.toString()+"]";
    }

}

public class power {
    public static void main(String[] args) {
        Stack st = new Stack(5);
        st.push(7);
        st.push(9);
        st.push(3);
        st.push(1);
        st.push(7);
        System.out.println(st.size());
        System.out.println(st);
    }
}
