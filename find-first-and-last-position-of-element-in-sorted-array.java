class Solution {
    public int[] searchRange(int[] nums, int target) {
        int leftIndex = leftMostIndex(nums, 0, nums.length-1, target);
        
        if(leftIndex == -1) {
            return new int[]{-1, -1};
        }
        
        int rightIndex = rightMostIndex(nums, leftIndex, nums.length-1, target);
        
        return new int[]{leftIndex, rightIndex};
    }
    
    int leftMostIndex(int[] nums, int left, int right, int target) {
        int index = -1;
        while(left<=right) {
            int mid = (right + left)/2;
            
            if(target > nums[mid]) {
                left = mid + 1;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                right = mid - 1;
                index = mid;
            }
        }
        return index;
    }
    
    int rightMostIndex(int[] nums, int left, int right, int target) {
        int index = -1;
        while(left<=right) {
            int mid = (right + left)/2;
            
            if(target > nums[mid]) {
                left = mid + 1;
            } else if(target < nums[mid]) {
                right = mid - 1;
            } else {
                left = mid + 1;
                index = mid;
            }
        }
        return index;
    }
}
