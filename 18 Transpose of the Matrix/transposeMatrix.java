

public class transposeMatrix {

    public static void main(String[] args) {
        int[][] arr = {{1,1,1},{2,3,2},{5,5,5}};
        transpose(arr);
    }
    public static int[][] transpose(int[][] arr) {
        int m = arr.length, n = arr[0].length;
        int[][] transpose = new int[n][m];
        for(int i=0; i<n; i++){
            for(int j=0; j<m; j++){
                transpose[i][j] = arr[j][i];
            } 
        }
        for(int[] e : transpose){
            for(int j: e){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        return transpose;

    }
}

