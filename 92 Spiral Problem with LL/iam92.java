public class iam92 {
        public int[][] spiralMatrix(int m, int n, ListNode head) {
        int[][] arr = new int[m][n];
        for(int i=0; i<arr.length; i++){
            for(int j=0; j<arr[i].length; j++) arr[i][j]=-1;
        }
        ListNode traverse = head;
        int minR = 0, minC = 0, maxR = arr.length-1, maxC = arr[0].length-1;

        while(minR<=maxR && minC<=maxC && traverse!=null){

            for(int i = minC; i<=maxC && traverse != null; i++){
                arr[minR][i] = traverse.val;
                traverse = traverse.next;
            }
            minR++;

            if(minR>maxR || minC>maxC || traverse==null) break;

            for(int i = minR; i<=maxR && traverse != null; i++){
                arr[i][maxC] = traverse.val;
                traverse = traverse.next;
            }
            maxC--;

            if(minR>maxR || minC>maxC || traverse==null) break;
            
            for(int i = maxC; i>=minC && traverse != null; i--){ 
                arr[maxR][i] = traverse.val;
                traverse = traverse.next;
            }
            maxR--;

            if(minR>maxR || minC>maxC && traverse!=null) break;
            for(int i = maxR; i>=minR && traverse != null; i--){ 
                arr[i][minC] = traverse.val;
                traverse = traverse.next;
            }
            minC++;
    }
        return arr;
    }
}
