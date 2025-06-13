import java.util.*;
import java.util.Stack;
public class iam127 {
    public static void main(String[] args) {
        Map<Character, Integer> priority = new HashMap<>();
        priority.put('+', 1);
        priority.put('-', 1);
        priority.put('*', 2);
        priority.put('/', 2);
        priority.put('%', 2);  

        Stack<String> val = new Stack<>();
        Stack<Character> op = new Stack<>();

        String s = "(7+9)*4/8-3";
        int n=s.length();
        for(int i=0; i<n; i++){
            if(Character.isDigit(s.charAt(i))) val.push((s.charAt(i)-48)+"");
            else{
                if(op.isEmpty() || priority.get(s.charAt(i))>priority.get(op.peek())) op.push(s.charAt(i));  
                else{
                    while(!op.isEmpty() && priority.get(s.charAt(i))<=priority.get(op.peek())){
                        String val2 = val.pop();
                        String val1 = val.pop();
                        char ch = op.pop();
                        String ans = ch+val1+val2;
                        val.push(ans);
                    }
                    op.push(s.charAt(i));
                }

            }

        }
        while(!op.isEmpty()){
            String val2 = val.pop();
            String val1 = val.pop();
            char ch = op.pop();
            String ans = ch+val1+val2;
            val.push(ans);

        }
        System.out.println(val);
        System.out.println(op);
        System.out.println(val.peek());
    }
}