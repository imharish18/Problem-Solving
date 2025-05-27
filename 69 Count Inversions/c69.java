public class c69 {
    static int count = 0;
    public static void countInversion(int[] ar1, int[] ar2){
        int i=0,j=0;
        while(i<ar1.length && j<ar2.length){
            if(ar1[i]>ar2[j]){
                count=count+(ar1.length-i);
                j++;
            }else if(ar1[i]<=ar2[j]){
                i++;

            }
        }
    }
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
            countInversion(a, b);
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
        int[] arr = {8,2,5,3,1,4};
        mergeSort(arr);
        System.out.println(count);
    }
    
    public static void print(int[] ar){
        for(int e:ar){
            System.out.print(e+" ");
        }
    }
}
