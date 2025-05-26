import java.util.*;
public class parenSOl {
    public static void parenthesis(ArrayList<String> ar, int open,int close, int n, String ans){
        if(ans.length()==2*n){
            ar.add(ans);
            return;
        }
        if(open<n) parenthesis(ar, open+1, close, n, ans+'(');
        if(close<open) parenthesis(ar, open, close+1, n, ans+')');
    }

    public List<String> generateParenthesis(int n) {
        ArrayList<String> ar = new ArrayList<>();
        parenthesis(ar,0,0,n, "");
        return ar;
    }
}
