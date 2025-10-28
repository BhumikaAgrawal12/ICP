import java.util.ArrayDeque;
import java.util.ArrayList;
class Solution {
    public ArrayList<Integer> OnlineStockSpan(int[] arr) {
        // code here
        ArrayDeque<Integer>st=new ArrayDeque<>();
        ArrayList<Integer>ans=new ArrayList<>();
        for(int i=0;i<arr.length;i++){
            while(!st.isEmpty() && arr[st.peek()]<=arr[i]){
                st.pop();
            }
            if(st.isEmpty()){
                ans.add(i+1);
            }
            else{
                ans.add(i-st.peek());
            }
            st.push(i);
        }
        return ans;
    }
}