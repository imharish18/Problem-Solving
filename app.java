class mountainProblem {
    public static int mySqrt(int x) {
        int lo = 0, hi=x;
        int mid=0;
        while(lo<=hi){
            mid = lo + (hi-lo)/2;
            if(mid*mid==x) return mid;
            else if(mid*mid>x) hi = mid-1;
            else lo = mid+1;
        }
        return hi;
    }
    public static void main(String[] args){
    System.out.println(mySqrt(14));
    }
}