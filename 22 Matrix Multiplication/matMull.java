public class matMull {
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
        }


    }
}