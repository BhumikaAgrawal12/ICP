import java.util.*;
class Solution {
    public List<List<Integer>> CombinationSum2(int[] candidates, int target) {
        Arrays.sort(candidates);
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> path = new ArrayList<>();
        fun(candidates,target,0,ans,path);
        return ans;
    }
    public void fun(int[] candidates,int target, int s,List<List<Integer>> ans,List<Integer> path)
    {
        //base case
        if(target==0)
        {
           ans.add(new ArrayList<Integer>(path) );
            return;
        }
        for(int i=s;i<candidates.length;i++)
        {
            if(i>s && candidates[i]==candidates[i-1])
            continue;
            if(candidates[i]>target)
            {
                continue;
            }
            path.add(candidates[i]);
           fun(candidates,target-candidates[i],i+1,ans,path);
            path.remove(path.size()-1);
        }
             
    }
}