public class code {
    public static int nthStairs(int n) {
        if(n<=2) return n;
        else return nthStairs(n-1)+nthStairs(n-2);
    }
}
