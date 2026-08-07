class Solution {
    public int[] singleNumber(int[] nums) {
        int xor = 0;
        for(int n : nums){
            xor ^= n;
        }
        int diff = xor & -xor;
        int first = 0;
        int second = 0;
        for(int n : nums){
            if((n & diff) == 0){
                first ^= n;
            }else{
                second ^= n;
            }
        }
        return new int[]{first , second};
    }
}