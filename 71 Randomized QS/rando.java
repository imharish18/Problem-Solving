public class rando {
        public static void swap(int[] ar, int i, int j){
                int temp = ar[i];
                ar[i] = ar[j];
                ar[j]=temp;
    }

    public static int procedure(int[] ar, int lo, int hi){
        int mid = (lo+hi)/2;
        int pivot = ar[mid], pIdx = mid;
        int smallerCount = 0;
        for(int i=lo; i<=hi; i++){
            if(i==mid) continue;
            if(ar[i]<=pivot) smallerCount++;
        }
        pIdx = lo+smallerCount;
        swap(ar, mid, pIdx);
        pivot = ar[pIdx];
        int i=lo,j=hi;
        while(i<pIdx && j>pIdx){
            if(ar[i]<=pivot) i++;
            else if(ar[j]>pivot) j--;
            else if(ar[i]>pivot && ar[j]<=pivot){
                swap(ar, i, j);
                i++;
                j--;
            }
        }
        return pIdx;
    }
    public static void quickSort(int[] ar, int lo, int hi){
        if(lo>=hi) return;
        int p = procedure(ar, lo, hi);
        quickSort(ar, lo, p-1);
        quickSort(ar, p+1, hi);
    }
}
