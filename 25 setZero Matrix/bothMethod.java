public class bothMethod {
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

}
