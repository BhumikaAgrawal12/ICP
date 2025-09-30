import java.util.*;
class FindAllAnagramsInString {
    public List<Integer> findAnagrams(String s, String p) {
        List<Integer>ans=new ArrayList<>();
        if(p.length()>s.length()){
            return ans;
        }
        HashMap<Character,Integer>map1=new HashMap<>();
        HashMap<Character,Integer>map2=new HashMap<>();
        
        for(int i=0;i<p.length();i++){
            map1.put(p.charAt(i),map1.getOrDefault(p.charAt(i),0)+1);
            map2.put(s.charAt(i),map2.getOrDefault(s.charAt(i),0)+1);
        }
        if(map1.equals(map2)){
            ans.add(0);
        }
        
        for(int i=p.length();i<s.length();i++){
            char ch1=s.charAt(i-p.length());
            char ch2=s.charAt(i);
            map2.put(ch1,map2.get(ch1)-1);
            if(map2.get(ch1)==0){
                map2.remove(ch1);
            }
            map2.put(ch2,map2.getOrDefault(ch2,0)+1);
            if(map1.equals(map2)){
                ans.add(i-p.length()+1);
            }
        }
        return ans;
            
        
    }
}