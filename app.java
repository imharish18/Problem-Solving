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
    }

    public static void main(String[] args) {
        List<List<Integer>> n = generate(7);
        System.out.println(n);

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



