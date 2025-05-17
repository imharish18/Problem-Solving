import java.util.Arrays;
import java.util.Scanner;

public class SumofMat {

    public static void main(String[] args) {
        int[][] arr1 = {{1,1,1},{2,3,2},{5,5,5}};
        int[][] arr2 = {{3,3,3},{6,6,6},{2,2,2}};
        int[][] res = new int[3][3];
        if(arr1.length == arr2.length && arr1[0].length == arr2[0].length){
            for(int i=0; i<arr1.length; i++){
                for(int j=0; j<arr2[0].length; j++){
                    res[i][j] = arr1[i][j]+arr2[i][j];
                }
            }
            for(int[] e : res){
                for(int j: e){
                    System.out.print(j+" ");
                }
                System.out.println();
            }

        }else{
            System.out.println("The order of the matrices is not same!!");
        }
       



    }
}

