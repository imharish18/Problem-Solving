import java.util.Deque;
import java.util.ArrayDeque;
public class iamleet239 {
        public static int[] maxSlidingWindow(int[] nums, int k) {
        if(k==1) return nums;
        Deque dq = new ArrayDeque<>();
        int n = nums.length;
        int idx=0;
        int[] ans  = new int[n-k+1];
        for(int i=0; i<n; i++){
            while(!dq.isEmpty() && nums[i]>nums[(int)dq.peekLast()]) dq.removeLast();
            dq.addLast(i);
            while((i-k+1)>(int)dq.peekFirst()) dq.removeFirst();
            if(i>=k-1) ans[idx++]=nums[(int)dq.peek()];
        }

        System.out.println(dq);
        for(int x: ans){
            System.out.print(x+" ");
        }
        return ans;
    }
}
