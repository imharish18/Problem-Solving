public class mergeSrt {
        public static void mergeSort(int[] ar){
            int n = ar.length;
            if(n==1) return;

            int[] a = new int[n/2];
            int[] b = new int[n-n/2];
            //COPY
            for(int i=0; i<n/2; i++){
                a[i]=ar[i];
            }
            for(int i=0; i<n-n/2; i++){
                b[i]=ar[n/2+i];
            }
            mergeSort(a);
            mergeSort(b);
            merge(a,b,ar);
            a=null; b=null;
        }

    public static void merge(int[] a, int[] b, int[] res){
        int m=a.length,n=b.length;
        
        int i=0, j=0, k=0;
        while(i<m && j<n){
            if(a[i]<=b[j]) res[k++]=a[i++];
            else res[k++]=b[j++];
        }
        while(i!=m) res[k++]=a[i++];
        while(j!=n) res[k++]=b[j++];

    }
    public static void main(String[] args) {
        int[] ar = {45,23,77,44,34,12,78,34,21,65,87,32,67};
        print(ar);
        mergeSort(ar);
        print(ar);
    }
    
    public static void print(int[] ar){
        for(int e:ar){
            System.out.print(e+" ");
        }
    }
} 

