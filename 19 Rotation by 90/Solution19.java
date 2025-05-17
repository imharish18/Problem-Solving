public class Solution19 {
    public void rotate(int[][] matrix) {
        transpose(matrix);
        reverse90(matrix);

    }
    public static void transpose(int[][] matrix){
        int n = matrix.length;
        for(int i=0; i<n; i++){
            for(int j=i; j<n; j++){
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
    }
    public static void reverse90(int[][] matrix){

        for(int i=0; i<matrix.length; i++){
            int x=0, y=matrix.length-1;
            while(x<=y){
                int temp = matrix[i][x];
                matrix[i][x] = matrix[i][y];
                matrix[i][y] = temp;
                x++;
                y--;
            }
        }
    }
}

