public class iam177 {
    public int maxSatisfied(int[] ar, int[] gr, int k) {
        int n = ar.length,unsfy=0,maxUnsfy=Integer.MIN_VALUE;
        for(int i=0; i<k; i++){
            if(gr[i]==1) unsfy+=ar[i];
        }
        maxUnsfy = Math.max(maxUnsfy,unsfy);
        int i=0,j=k,idx=0;
        while(j<n){
            if(gr[i]==1) unsfy-=ar[i];
            if(gr[j]==1) unsfy+=ar[j];
            if(maxUnsfy<unsfy){
                maxUnsfy=unsfy;
                idx=i+1;
            }
            i++;j++;
        }
        for(int x = idx; x<idx+k; x++){
            gr[x]=0;
        }
        int satisfy = 0;
        for(int x=0; x<n; x++){
            if(gr[x]==0) satisfy+=ar[x];
        }
        return satisfy;
    }
}
