public class arraySum {
    public static int functionSum(int[] arr) {
        int sum = 0;
        for(int i=0;i<arr.length; i++){
            sum+=arr[i];
        }
        System.out.println(sum);
        return sum;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        functionSum(arr);
    }
}
