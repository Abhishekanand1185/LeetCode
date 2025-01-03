/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n = mountainArr.length();
        int peak = findPeak(mountainArr, n);
        int res = findTarget(mountainArr, 0, peak, target, true);
        if(res != -1){
            return res;
        }
        return findTarget(mountainArr, peak+1, n-1, target, false);
    }

    private int findTarget(MountainArray mountainArr, int left, int right, int target, boolean isUpside){
        while(left <= right){
            int mid =  left+(right-left)/2;
            int midVal = mountainArr.get(mid);

            if(midVal == target){
                return mid;
            }
            if(isUpside){
                if(midVal > target){
                    right = mid - 1;
                } else{
                    left = mid + 1;
                }
            } else{
                if(midVal > target){
                    left = mid + 1;
                } else{
                    right = mid - 1;
                }
            }
        }
    return -1;
    }
    private int findPeak(MountainArray mountainArr, int length){
        int left = 0;
        int right = length-1;
        while(left < right){
            int mid = left+(right-left)/2;
            if(mountainArr.get(mid) < mountainArr.get(mid+1)){
                left = mid + 1;
            } else{
                right = mid;
            }
        }
    return left;
    }
}