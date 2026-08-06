class Solution {
    public int smallestNumber(int n, int t) {
        if(product(n) % t == 0) return n;
        int i = n+1;
        while(i > n){
            if(product(i) % t == 0){
                return i;
            }
            i++;
        }
        return -1;
    }
    public static int product(int n){
        int prod = 1;
        while(n > 0){
            prod = prod * (n % 10);
            n/=10;
        }
        return prod;
    }
}