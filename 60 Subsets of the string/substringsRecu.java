public class substringsRecu {
    public static void stringSubsets(int i, String s, String ans){
        if(i==s.length()){
            System.out.print(ans+" ");
            return;
        }
        char ch = s.charAt(i);
        stringSubsets(i+1, s, ans+ch);
        stringSubsets(i+1, s, ans);
    }
}
