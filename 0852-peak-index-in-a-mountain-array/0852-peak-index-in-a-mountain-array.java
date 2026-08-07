class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int left = 0;
        int right = arr.length - 1;
        while(left < right){
            int mid = left + (right - left)/2;
            if(arr[mid] < arr[mid+1]){
                left = mid + 1;
            }else{
                right = mid;
            }
        }
        return left;
    }
}
/* 
   
0   10   5   5
l    m       r

arr[mid] = 10 !< arr[mid + 1] = 5
right = mid;

0   10
l    r
m

arr[mid] = 0 < arr[mid+1];
left = mid + 1;

left = 10 -> return;
*/