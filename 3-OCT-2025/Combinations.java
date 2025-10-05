import java.util.*;
class Combinations {
    public List<List<Integer>> combine(int n, int k) {
        List<List<Integer>>ans=new ArrayList<>();
        ArrayList<Integer>list=new ArrayList<>(); 
        sol(n,1,k,ans,list);
        return ans;
    }
    void sol(int n,int start,int k,List<List<Integer>>ans,ArrayList<Integer>list){
        if(list.size()==k){
            ans.add(new ArrayList<>(list));
            return;
        }
        for(int i=start;i<=n;i++){
            list.add(i);
            sol(n,i+1,k,ans,list);
            //Backtrack
            list.remove(list.size()-1);
        }
        
    }
}