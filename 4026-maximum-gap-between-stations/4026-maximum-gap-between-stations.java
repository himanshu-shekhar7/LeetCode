class Solution {
    public int maximumGap(String skill, String station) {
        int n = skill.length();
        int m = station.length();
        int []minPos = new int[n];

        if(n == 1) return 0;

        int j = 0;
        for(int i = 0 ; i < n ; i++){
            while(j < m && station.charAt(j) != skill.charAt(i)){
                j++;
            }
            minPos[i] = j;
            j++;
        }
        int maxPos[] = new int[n];
        j = m - 1;
        for(int i = n - 1 ; i >= 0 ; i--){
            while(j >= 0 && station.charAt(j) != skill.charAt(i)){
                j--;
            }
            maxPos[i] = j;
            j--;
        }
        int maxGap = 0;
        for(int i = 1 ; i < n ; i++){
            int gap = maxPos[i] - minPos[i-1];
            maxGap = Math.max(maxGap , gap);
        }
        return maxGap;
    } 
}