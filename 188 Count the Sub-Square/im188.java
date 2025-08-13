public class im188 {
    public int countSquares(int[][] ar) {
        int m = ar.length;
        int n = ar[0].length;
        int count = 0;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if(ar[i][j] == 0) continue;
                if (i > 0 && j > 0) 
                    ar[i][j] += Math.min(ar[i - 1][j], Math.min(ar[i][j - 1], ar[i - 1][j - 1]));
                count += ar[i][j];
            }
        }
        return count;
    }
}
