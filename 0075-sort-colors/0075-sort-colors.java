class Solution {
    public void sortColors(int[] nums) {
        int n = nums.length;
        int left = 0;
        int mid = 0;
        int right = n - 1;
        while(mid <= right){
            if(nums[mid] == 0){
                int temp = nums[mid];
                nums[mid++] = nums[left];
                nums[left++]  = temp;
            }else if(nums[mid] == 2){
                int temp = nums[mid];
                nums[mid] = nums[right];
                nums[right--] = temp;
            }else{
                mid++;
            }
        }
    }
}