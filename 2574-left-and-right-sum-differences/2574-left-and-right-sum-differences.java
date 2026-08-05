class Solution {
    public int[] leftRightDifference(int[] nums) {
        int rightSum = 0;
        for(int i = 0 ; i < nums.length ; i++){
            rightSum += nums[i];
        }
        int leftSum = 0;
        int ans[] = new int[nums.length];
        for(int i = 0 ; i < nums.length ; i++){
            rightSum -= nums[i];
            ans[i] = Math.abs(leftSum - rightSum);
            leftSum += nums[i];
        }
        return ans;
    }
}