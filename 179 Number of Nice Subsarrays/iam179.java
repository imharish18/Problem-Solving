public class iam179 {
    public int numberOfSubarrays(int[] ar, int k) {
        int n = ar.length,count=0;
        int i=0, j=0, a=0, b=0;
        int k2 = 0;
        for(int x=0; x<n; x++){
            if(k2==k){
                if(ar[x]%2==0) b=x;
                else break;
            }
            else if(ar[x]%2!=0){
                k2++;
                if(k2==1) i=x;
                if(k2==k) j=x;
                b=j;
            }
        }
        if(k2<k) return 0;
        if(b==n-1 && a==0){
            return (i-a+1)*(b-j+1);
        }
        while(b<n){
            count+=(i-a+1)*(b-j+1);            
            a=i+1;
            i++;
            while(i<n && ar[i]%2==0) i++;
            j=b+1;
            b=j+1;
            while(b<n && ar[b]%2==0) b++;
            b--;
        }
        return count;
    }
}
