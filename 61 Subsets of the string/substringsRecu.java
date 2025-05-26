import java.util.ArrayList;

class subStringRecursion{
    static ArrayList<String> als = new ArrayList<>();
    public static void stringSubsets(int i, String s, String ans){
        if(i==s.length()){
            als.add("'"+ans+"'");
            return;
        }
        char ch = s.charAt(i);
        stringSubsets(i+1, s, ans+ch);
        stringSubsets(i+1, s, ans);
    }
    public static void main(String[] args) {
        int[] arr = {1,4,5,6,7,9,0,5,3,2};
        String s = "abcd";
        stringSubsets(0,s,"");
        System.out.println(als);
    }
} 