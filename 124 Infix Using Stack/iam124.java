import java.util.*;
import java.util.Stack;
public class iam124 {
    public static int solver(int val1, int val2, char ch){
        if(ch=='+') return val1+val2;
        else if(ch=='-') return val1-val2;
        else if(ch=='*') return val1*val2;
        else return val1/val2;
    }

    public static void main(String[] args) {
        Map<Character, Integer> priority = new HashMap<>();
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('%', 2);  

        Stack<Integer> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String s = "2+6*4/8-3";
        int n=s.length();
        for(int i=0; i<n; i++){
            if(Character.isDigit(s.charAt(i))) val.push(s.charAt(i)-48);
            else{
                if(op.isEmpty() || priority.get(s.charAt(i))>priority.get(op.peek())) op.push(s.charAt(i));  
                else{
                    while(!op.isEmpty() && priority.get(s.charAt(i))<=priority.get(op.peek())){
                        int val2 = val.pop();
                        int val1 = val.pop();
                        char ch = op.pop();
                        int ans = solver(val1,val2,ch);
                        val.push(ans);

                    }
                    op.push(s.charAt(i));
                }

            }

        }
        while(!op.isEmpty()){
            int val2 = val.pop();
            int val1 = val.pop();
            char ch = op.pop();
            int ans = solver(val1,val2,ch);
            val.push(ans);
        }
        System.out.println(val);
        System.out.println(op);
        System.out.println(val.peek());
    }
}
