public class im197{
    public static boolean searchMatrix(int[][] ar, int target) {
        int row = 0;
        int col = ar[0].length-1;
        while(row<ar.length && col>=0){
            if(ar[row][col]==target) return true;
            else if(ar[row][col]<target) row++;
            else col--;
        }
        return false;
    }
    public static void main(String[] args) {
        int[][] ar = {{10,20,30,40},{15,25,35,45},{27,29,37,48},{32,33,39,50}};
        searchMatrix(ar,33);
    }
}