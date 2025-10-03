class Solution {
    public List<List<Integer>> combinationSum2(int[] candidates, int target) {
        List<List<Integer>> arr1 = new ArrayList<>();
        List<Integer> arr2 = new ArrayList<>();
        Arrays.sort(candidates);
        helper(candidates,target,arr1,arr2,0,0);
        return arr1;
    }
    public void helper(int[] candidates,int target, List<List<Integer>>arr1,List<Integer> arr2,int sum,int i)
    {
        // base condition 
        if(sum==target)
        {
            arr1.add(new ArrayList<>(arr2));
            return ;
        }
        if(i>=candidates.length || sum>target)
        {
            return ;
        }
        // add
        for(int j=i;j<candidates.length;j++)
        {
            if(j>i && candidates[j]==candidates[j-1])
            continue;
            if (sum + candidates[j] > target) break;
            arr2.add(candidates[j]);
            helper(candidates,target,arr1,arr2,sum+candidates[j],j+1);
            // remove
            arr2.remove(arr2.size()-1);
            // helper(candidates,target,arr1,arr2,sum,i+1);
        }
    }
}
