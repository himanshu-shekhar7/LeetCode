class Solution {
    public boolean checkDivisibility(int n) {
        int sum = 0;
        int prod = 1;
        int x = n;
        while(n > 0){
            int temp = n % 10;
            sum += temp;
            prod *= temp;
            n /= 10;
        }
        int d = sum + prod;
        return true ? x % d == 0 : false;
    }
}