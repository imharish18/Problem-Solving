public class cns {
        public static String countAlpha(String s){
        String ans = "";
        int i=0,j=1;
        if(s.length()>0){
            for(int k=0; k<s.length(); k++){
                if(j<s.length() && s.charAt(i)==s.charAt(j)) j++;
                else{
                    ans+=(j-i);
                    ans+=(s.charAt(i));
                    i=j;
                    j++;
                }
            }
        }
        return ans;
    }

    public static String countAndSay(int n) {
        if(n==1) return "1";
        String s = countAndSay(n-1);
        String ans=countAlpha(s);
        return ans;
    }
}
