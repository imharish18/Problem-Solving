import java.util.*;

public class solvingProblem {
    public static void printArray(int[] ar){
        for(int x : ar){
            System.out.print(x+" ");
        }
        System.out.println();
    } 
    public static int trap(int[] ar) {
        printArray(ar);
        int n = ar.length; 
        int[] lge = new int[n];
        lge[0]=ar[0];
        for(int i=1; i<n; i++){
            lge[i] = Math.max(lge[i-1],ar[i]);
        }
        printArray(lge);

        int[] rge = new int[n];
        rge[n-1] = ar[n-1];
        for(int i = n-2; i>=0; i--){
            rge[i] = Math.max(rge[i+1],ar[i]);
        }
        int trappedWater = 0;
        for(int i=0; i<n; i++){
            int min = Math.min(lge[i],rge[i]);
            trappedWater+=(min-ar[i]);
        }
        System.out.println(trappedWater);
        return trappedWater;
    }
    public static void main(String[] args) {
        int[] ar = {4,2,0,6,3,2,5};
        trap(ar);
    }
}
