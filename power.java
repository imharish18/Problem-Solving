import java.util.*;
import java.util.Stack;
public class power {
     public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        Queue q = new LinkedList<>();
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        while(!q.isEmpty()) st.push((int)q.remove());
        System.out.println(st);
        System.out.println(q);
        while (!st.isEmpty()) q.add(st.pop());
            
        System.out.println(st);
        System.out.println(q);


        System.out.println(q);
    }
}
