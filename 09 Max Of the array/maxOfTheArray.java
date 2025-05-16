public class maxOfTheArray {
    public static int functionMax(int[] arr) {
        int max = Integer.MIN_VALUE;

        for(int i=0;i<arr.length; i++){
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
        return max;
    }
    public static void main(String[] args) {
        int[] arr2 = {1,2,9,3,4,5};
        int[] arr3 = {92,19,53,4,5};
        functionMax(arr2);
        functionMax(arr3);
    }
}
