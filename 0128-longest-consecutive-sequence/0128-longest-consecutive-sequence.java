class Solution {
    public int longestConsecutive(int[] nums) {
        HashSet<Integer> set = new HashSet<>();
        for(int num : nums){
            set.add(num);
        }
        int longSeq = 0;
        for(int n : set){
            if(!set.contains(n-1)){
                int m = n + 1;
                int count = 1;
                while(set.contains(m)){
                    m++;
                    count++;
                }
                longSeq = Math.max(longSeq , count);
            }
        }
        return longSeq;
    }
}