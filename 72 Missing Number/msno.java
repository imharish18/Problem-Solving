public class msno {
        public int missingNumber(int[] ar) {
        int n=ar.length;
        int val=0;
        for(int ele : ar){
            val+=ele;
        }
        int totalSum = (n*(n+1))/2;
        return totalSum-val;
    }
}
