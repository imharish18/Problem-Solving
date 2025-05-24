public class powab {
    public static int pow(int a, int b) {
        if(b==0) return 1;
        return a*pow(a,b-1);
    }
}
