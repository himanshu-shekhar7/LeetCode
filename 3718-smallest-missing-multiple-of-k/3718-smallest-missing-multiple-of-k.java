class Solution {
    public int missingMultiple(int[] nums, int k) {
        HashSet<Integer> set = new HashSet<>();
        for(int n : nums){
            set.add(n);
        }
        int curr = k;
        while(set.contains(curr)){
            curr+=k;
        }
        return curr;
    }
}