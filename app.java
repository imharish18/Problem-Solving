class app{
    public static int maze(int row, int col, int n, int m) {
        if(row == m || col == n) return 1;
        else return maze(row+1,col,m,n)+maze(row,col+1,m,n);
    }
    public static void main(String[] args) {
        System.out.println(maze(1,1,3,3));
    }
} 