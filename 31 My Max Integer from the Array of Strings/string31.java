public class string31 {

    public static String purify(String a){
        for(int i=0; i<a.length(); i++){
            if(i==a.length()-1 || a.charAt(i)!='0') return a.substring(i);

        }
        return a;
    }

    public static String max(String a, String b){
        String s = purify(a);
        String t = purify(b);

        if(s.length()>t.length()){
            return a;
            
        }

        if(s.length()<t.length()){
            return b;
        }

        for(int i=0; i<a.length(); i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return a;
                else return b;
            }
        }
        if(a.length()>=b.length()) return a;
        else return b;
    }
    public static String min(String a, String b){
        String s = purify(a);
        String t = purify(b);

        if(s.length()>t.length()){
            return b;
            
        }

        if(s.length()<t.length()){
            return a;
        }

        for(int i=0; i<a.length(); i++){
            if(s.charAt(i)!=t.charAt(i)){
                if(s.charAt(i)>t.charAt(i)) return b;
                else return a;
            }
        }
        if(a.length()>=b.length()) return b;
        else return a;
    }
    public static void main(String[] args) {
        String[] ar = {"0017","18","4","0019","000","01"};

        String maxS = ar[0];
        String minS = ar[0];
        for(int i=1; i<ar.length; i++){
            maxS = max(maxS,ar[i]);
            minS = min(minS,ar[i]);
        }
        System.out.println(maxS);
        System.out.println(minS);
    }
}

