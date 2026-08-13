class Solution {
    public int countDigits(int num) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int temp = num;
        while (temp > 0) {
            int t = temp % 10;
            temp /= 10;
            map.put(t, map.getOrDefault(t, 0) + 1);
        }
        int ans = 0;
        for (int n : map.keySet()) {
            if (num % n == 0) {
                ans += map.get(n);
            }
        }
        return ans;
    }
}
/*
class Solution {
    public int countDigits(int num) {
        int temp = num;
        int count = 0;

        while (temp > 0) {
            int digit = temp % 10;
            if (num % digit == 0) {
                count++;
            }
            temp /= 10;
        }

        return count;
    }
}
 */