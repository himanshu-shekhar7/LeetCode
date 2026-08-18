class Solution {
    public int maxProduct(int n) {
        int firstLargest = 0;
        int secondLargest = 0;
        while (n > 0) {
            int temp = n % 10;
            if (temp >= firstLargest) {
                secondLargest = firstLargest;
                firstLargest = temp;
            } else if (temp > secondLargest) {
                secondLargest = temp;
            }
            n /= 10;
        }

        return firstLargest * secondLargest;
    }
}