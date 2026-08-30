class Solution {
    public int minimumDeletions(int[] nums) {
        int n = nums.length;
        if (n <= 2) return n;

        int minIdx = 0;
        int maxIdx = 0;

        // Find the indices of the minimum and maximum elements
        for (int i = 1; i < n; i++) {
            if (nums[i] < nums[minIdx]) {
                minIdx = i;
            }
            if (nums[i] > nums[maxIdx]) {
                maxIdx = i;
            }
        }

        // Identify lower and higher indices relative to the array start
        int low = Math.min(minIdx, maxIdx);
        int high = Math.max(minIdx, maxIdx);

        // 1. Both from left
        int option1 = high + 1;
        // 2. Both from right
        int option2 = n - low;
        // 3. One from left, one from right
        int option3 = (low + 1) + (n - high);

        // Return the minimum deletions among all 3 options
        return Math.min(option1, Math.min(option2, option3));
    }
}