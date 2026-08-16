class Solution {
    public int minPenalty(int period, int[] lights, int[] arrivalTime) {
        int max = 0;
        for(int l : lights){
            if(l > max){
                max = l;
            }
        }
        int ans = 0;
        for(int t : arrivalTime){
            int r = t % period;
            if(r >= max){
                ans = Math.max(ans , period - r);
            }
        }
        return ans;
    }
}