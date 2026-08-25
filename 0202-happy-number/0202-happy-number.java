class Solution {
    public boolean isHappy(int n) {
        Set<Integer> seen = new HashSet<>();
        while(!seen.contains(n)){
            seen.add(n);
            n = get(n);
            if(n == 1) return true;
        }
        return false;
    }
    private int get(int n){
        int op = 0;
        while(n > 0){
            int d = n % 10;
            op += d * d;
            n = n /10;
        }
        return op;
    }
}