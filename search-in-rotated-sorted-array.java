class Solution {
    public int search(int[] nums, int target) {
        if (nums.length == 1)
            return nums[0] == target ? 0 : -1;
        
        int index = rotateIndex(nums);
        if(nums[index] == target) return index;
        
        if(index == 0)
            return search(nums, 0, nums.length - 1, target);
        else {
            if(target >= nums[0])
                return search(nums, 0, index, target);
            else 
                return search(nums, index, nums.length-1, target);
        }
    }
    
    int rotateIndex(int[] nums) {
        int left = 0, right = nums.length-1;
        
        if (nums[left] < nums[right])
            return 0;
        
        while(left <= right) {
            int mid = (left + right)/2;
            
            if(nums[mid] > nums[mid+1]) {
                return mid+1;
            } else {
                if(nums[mid] < nums[left]) {
                    right = mid - 1;
                } else {
                    left = mid + 1;
                }
            }
        }
        return 0;
    }
    
    int search(int[] nums, int left, int right, int target) {
        while(left <= right) {
            int mid = (left+right)/2;
            if(nums[mid] == target) {
                return mid;
            }
            
            if(target > nums[mid]) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return -1;
    }
}
