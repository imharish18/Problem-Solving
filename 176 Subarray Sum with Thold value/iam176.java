public class iam176 {

    public int numOfSubarrays(int[] ar, int k, int t) {
        int count = 0, sum=0, n=ar.length;
        for(int i=0; i<k; i++){
            sum+=ar[i];
        }
        if(sum/k>=t) count++;
        int i=0, j=k;
        while(j<n){
            sum=sum-ar[i++]+ar[j++];
            if(sum/k>=t) count++;
        }
        return count;
    }
}

