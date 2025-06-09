import java.util.ArrayList;

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
        for(int i=0; i<=top; i++){
            sb.append(st[i]+" ");
        }
        return "[ "+sb.toString()+"]";
    }


}

public class power {
    public static void removeDuplicates(int val, Stack st){
        while(val!=0){
            if(st.isEmpty()){
                st.push(val%10);
                val=val/10;
            }
            else if(st.peek()!=val%10){
                st.push(val%10);
                val=val/10;
            }
            else{
                st.pop();
                val=val/10;
            }
        }
        System.out.println(st);
    }
    public static String minWindow(String s, String t) {
        ArrayList<String> al = new ArrayList<>();
        String newANS = s;

        for(int i=t.length(); i<=s.length()+1; i++){
            for(int j=i+1; j<s.length(); j++){
                String ans = s.substring(i, j+1);
                Boolean flag = true;
                for(char c : t.toCharArray()){
                    if(!ans.contains(c+"")) flag=false;
                }
                if(flag==true){
                    if(newANS.length()>ans.length()) newANS = ans;
                    al.add(ans);
                }

            }
        }
        return newANS;
    }

    public static void main(String[] args) {
        System.out.println(minWindow("ADOBECODEBANC", "ABC"));
        int[] ar = {1,3,2,1,8,6,3,4};
    }
}
