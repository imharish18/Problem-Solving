public class fibo {
    public static int fibboo(int n) {
        if(n==0) return 0;
        else if(n==1) return 1;
        else return fibboo(n-1)+fibboo(n-2);
    }
}
