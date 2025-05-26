public class prob63 {
        public static int gcdRec(int a, int b){
        for(int i=Math.min(a, b); i>1; i--){
            if(a%i==0 && b%i==0) return i;
        }
        return 1;
    }

    public static int hcf(int a, int b){
        if(b%a==0) return a;
        return hcf(b%a,b);
    }
    public static void main(String[] args) {
        System.out.println(gcdRec(96,30));
    }
}
