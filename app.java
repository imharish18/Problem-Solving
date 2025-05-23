import java.util.*;
class app{
    public static List<Integer> findClosestElements(int[] arr, int k, int x) {
        int left = 0, right = arr.length - k;
        while (left < right) {
            int midpoint = left + (right - left) / 2;
            if (x - arr[midpoint] > arr[midpoint + k] - x) {
                left = midpoint + 1;
            }
            else {
                right = midpoint;
                
            }
        }

        List<Integer> result = new ArrayList<>(k);
        for (int i = left; i < left + k; i++) {
            result.add(arr[i]);
        }
        return result;
    }
    public static void main(String[] args){
        int[] ar = {-2,-1,1,2,3,4,5};
        int k = 7;
        int x = 3;
        System.out.println(findClosestElements(ar,k,x));

    }
}