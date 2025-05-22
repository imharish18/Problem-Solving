class mountainProblem {
    public static int peakIndexInMountainArray(int[] arr) {
        int n = arr.length;
        int lo=1, hi=n-2;
        while(lo<=hi){
            int mid=lo+(hi-lo)/2;
            if(arr[mid]>arr[mid-1] && arr[mid]>arr[mid+1]) return mid;
            else if(arr[mid]>arr[mid-1] && arr[mid]<arr[mid+1]) lo=mid+1;
            else if(arr[mid]<arr[mid-1] && arr[mid]>arr[mid+1]) hi=mid-1;
        }
        return -1;
    }
    public static void main(String[] args){
        int[] ar = {1,2,3,4,5,3,2};
        int x = peakIndexInMountainArray(ar);
        System.out.println(x);
    }
}