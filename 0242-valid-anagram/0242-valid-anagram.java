import java.util.*;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;
        int[] arr = new int[26];
        for(int i = 0 ; i < s.length() ; i++){
            int p = s.charAt(i) - 'a';
            int q = t.charAt(i) - 'a';
            arr[p]++;
            arr[q]--;
        }
        for(int n : arr){
            if(n != 0) return false;
        }
        return true;
    }
}
