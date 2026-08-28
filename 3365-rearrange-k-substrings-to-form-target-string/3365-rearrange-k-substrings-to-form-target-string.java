class Solution {
    public boolean isPossibleToRearrange(String s, String t, int k) {
        HashMap<String,Integer>hm=new HashMap<>();
        if(s.length()!=t.length())return false;
        int part=s.length()/k;
        for(int st=0,end=part;end<=s.length();st+=part,end+=part){
            hm.put(s.substring(st,end),hm.getOrDefault(s.substring(st,end),0)+1);
        }
        for(int st=0,end=part;end<=s.length();st+=part,end+=part){
            String sub=t.substring(st,end);
            if(!hm.containsKey(sub))return false;
            hm.put(sub,hm.get(sub)-1);
            if(hm.get(sub)==0)hm.remove(sub);
        }
        return hm.size()==0;
    }
}