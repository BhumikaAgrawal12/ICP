
import java.util.*;
class SlidingWindowMaximum{
    public int[] maxSlidingWindow(int[] nums, int k) {
        Deque<Integer> dq=new ArrayDeque<>();
        int n=nums.length;
        int p=0;
        int arr[]=new int[n-k+1];
        for(int i=0;i<n;i++){
            if(!dq.isEmpty() && dq.getFirst()<=i-k){
                dq.removeFirst();
            }
            while(!dq.isEmpty() && nums[dq.getLast()]<=nums[i]){
                dq.removeLast();
            }
            dq.addLast(i);
            if(i>=k-1){
                arr[p++]=nums[dq.getFirst()];
            }
        }
        return arr;
    }
}