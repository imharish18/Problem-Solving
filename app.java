import java.util.Arrays;
import java.util.Scanner;

public class app {

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,3,2},{5,5,5}};
        transpose(arr);
        System.out.println();
        printMat(arr);
        System.out.println();


    }
    public static void transpose(int[][] arr) {

        int m = arr.length, n = arr[0].length;
        int[][] transpose = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[i][j] = arr[j][i];
            } 
        }
        printMat(transpose);
    }

    // Reverse each Row;
    public static void revRow(int[][] mat){
        for(int i=0; i<mat[0].length; i++){
            int a=0, b=mat[0].length-1;
            while(a<b){
                int temp = mat[i][a];
                mat[i][a] = mat[i][b];
                mat[i][b] = temp;
                a++;
                b--;
            }
        }
        printMat(mat);
    }

    public static void printMat(int[][] arr){
        for(int[] e : arr){
        for(int j: e){
            System.out.print(j+" ");
        }
        System.out.println();
        }
    }
}



