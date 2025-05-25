
public class hey {
        public static int maze(int row, int col, int n, int m) {
        if(row == m || col == n) return 1;
        else return maze(row+1,col,m,n)+maze(row,col+1,m,n);
    }
}
