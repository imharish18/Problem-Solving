public class matrixScore {
    public static int matrixScore(int[][] grid) {

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
        return score;
    }
}
