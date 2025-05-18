import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class app {
        public static void printMat(int[][] arr){
        for(int[] e : arr){
        for(int j: e){
            System.out.print(j+" ");
        }
        System.out.println();
        }
        System.out.println("-------------------------------");
    }

    public static void main(String[] args) {
        int[][] matrix = {{0,1,2,0},{3,4,5,2},{1,3,1,5}};
        setZeroesFX(matrix);
    }

    public static void setZeroesFX(int[][] arr) {
        int m=arr.length, n=arr[0].length;
        boolean rowFlag = false, colFlag = false;

        for(int i=0; i<m; i++){
            if(arr[i][0]==0) rowFlag = true;
            break;
        }
        for(int j=0; j<n; j++){
            if(arr[0][j]==0) colFlag = true;
            break;
        }
        for(int i=1; i<m; i++){
            for(int j=1; j<n; j++){
                if(arr[i][j]==0){
                    arr[i][0]=0;
                    arr[0][j]=0;
                }
            }
        }

        // Traverse the 0th Row
        for(int i=0; i<m; i++){
            if(arr[i][0]==0){
                for(int j=1; j<n; j++){
                    arr[i][0]=0;
                }
            }
        }

        for(int j=0; j<n; j++){
            if(arr[0][j]==0){
                for(int i=1; i<m; i++){
                    arr[i][j]=0;
                }
            }
        }
        if(rowFlag==true){
            for(int i=0; i<m; i++){
                    arr[i][0]=0;
            }
        }
        if(colFlag==true){
            for(int j=0; j<n; j++){
                arr[0][j]=0;
            }
        }
        printMat(arr);
        
    }
    // Zerro the row'col of matrix;
    public static void setZeroes(int[][] matrix) {
        int m = matrix.length;
        int n = matrix[0].length;
        boolean[] row = new boolean[m];
        boolean[] col = new boolean[n];

        for(int i=0; i<m; i++){
            for(int j=0; j<n; j++){
                if(matrix[i][j]==0){
                    row[i] = true;
                    col[j] = true;
                }
            }
        }
        
        for(int i=0; i<m; i++){
                if(row[i]==true){
                    for(int j=0; j<m; j++){
                        matrix[i][j]=0;
                    }
                }
        }
        for(int j=0; j<n; j++){
                if(col[j]==true){
                    for(int i=0; i<m; i++){
                        matrix[i][j]=0;
                    }
                }
        }
    }
    //Seach in a matrix 2
        public static boolean searchMatrix(int[][] matrix, int target) {
            int i=0, j=matrix[0].length-1;
            while(i<matrix.length || j>=0){
                if(matrix[i][j]==target) return true;
                else if(matrix[i][j]<target)i++;
                else{j--;}
            }
        return false;
    }
    //Flipping Matrix
    public static int matrixScore(int[][] grid) {
        printMat(grid);
        // Flipping the Row;
        for(int i=0; i<grid.length; i++){
            if(grid[i][0]==0){
                for(int j=0; j<grid[0].length; j++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }
        }

        for(int j=0; j<grid[0].length; j++){
                    int noOfZ =0;
            for(int i=0; i<grid.length; i++){
                if(grid[i][j]==0) noOfZ++;
            }
            if(noOfZ>grid.length-noOfZ){
                for(int i=0; i<grid.length; i++){
                    if(grid[i][j]==0) grid[i][j]=1;
                    else grid[i][j]=0;
                }
            }

        }
        int score = 0;
        for(int i = 0; i < grid.length; i++) {
            int rowVal = 0;
            for(int j = 0; j < grid[0].length; j++) {
                rowVal = rowVal * 2 + grid[i][j];
            }
            score += rowVal;
        }
        printMat(grid);
        return score;
    }
    //Matrix Multiplication;
    public static void matMul(int[][] a1, int[][] a2) {

        if(a1[0].length == a2.length){
            int m = a1.length;
            int n = a2[0].length;
            int[][] res = new int[m][n];
            //Multiplication;
            for(int i=0; i<m; i++){
                for(int j=0; j<n; j++){

                    for(int k=0; k<a2.length; k++){
                        res[i][j] += a1[i][k]*a2[k][j];
                    }

                }
            }
            System.out.println("'''''''''''''''''''''''''''");
            printMat(a1);
            System.out.println("'''''''''''''''''''''''''''");
            printMat(a2);
            System.out.println("'''''''''''''''''''''''''''");
            printMat(res);
        }


    }
    // Pascal with ArrayList;
    public static List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        for(int i=0; i<numRows-1; i++){
            List<Integer> l  = new ArrayList<>();
            for(int j=0; j<=i; j++){
                if(j==0 || j==i){
                    l.add(1);
                }else{
                    l.add(ans.get(i-1).get(j)+ans.get(i-1).get(j-1));
                }
            }
            ans.add(l);
        }
        return ans;
    }
    // Spiral Form;
    public static void spiralOrder(int[][] arr) {
        int minR = 0, minC = 0, maxR = arr.length-1, maxC = arr[0].length-1;
        ArrayList<Integer> al = new ArrayList<>();
        while(minR<=maxR && minC<=maxC){
            for(int i = minC; i<=maxC; i++){ 
                al.add(arr[minR][i]);
            }
            minR++;
            if(minR>maxR || minC>maxC) break;

            for(int i = minR; i<=maxR; i++){
                al.add(arr[i][maxC]);
            }
            maxC--;
            if(minR>maxR || minC>maxC) break;
            
            for(int i = maxC; i>=minC; i--){ 
                al.add(arr[maxR][i]);
            }
            maxR--;
            if(minR>maxR || minC>maxC) break;

            for(int i = maxR; i>=minR; i--){ 
                al.add(arr[i][minC]);
            }
            minC++;
    }
    System.out.println(al);

    }
    // Waveprint Functoin
    public static void wavePrint(int[][] arr) {
        int m = arr.length;
        int n = arr[0].length;

        for(int i=0; i<m; i++){
            if(i%2==0){
                for(int j=0; j<n; j++){
                    System.out.print(arr[j][i]+" ");
                }
            }else{
                    for(int j=n-1; j>=0; j--){
                    System.out.print(arr[j][i]+" ");
                }
            }
        }
        
    }
    // Transpose of the matrix;
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
}



