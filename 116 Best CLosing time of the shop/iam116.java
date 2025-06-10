public class iam116 {
    public static int bestClosingTime(String s) {
        int n= s.length();
        int[] pre = new int[n+1];
        int[] suf = new int[n+1];

        int no = 0;
        pre[0] = 0;
        for(int i=0; i<n; i++){
            if(s.charAt(i)=='N')no++;
            pre[i+1] = no;
        }


        int yes = 0;
        suf[n] = 0;
        for(int i=n-1; i>=0; i--){
            if(s.charAt(i)=='Y')yes++;
            suf[i]=yes;
        }

        int minPen = n;
        for(int i=0; i<=n; i++){
            pre[i]+=suf[i];
            minPen = Math.min(pre[i],minPen);
        }
        for(int i=0; i<=n; i++){
            if(pre[i]==minPen) return i;
        }

        return n;
    }
    public static void main(String[] args) {
        String s = "YNYY";
        System.out.println(bestClosingTime(s));
    }
}
