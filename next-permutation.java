/***
Steps:
1. Find for the first decrease value from the end of the array.
2. Find the first greater or equal to the decrease value from the end of the array.
3. swap both the values of step1 and step2.
4. reverse the array from (step1 + 1) position to the end of the array.
***/

class Solution {
    public void nextPermutation(int[] nums) {
        int i = nums.length-2;
        while(i>=0 && nums[i]>=nums[i+1]) {
            i--;
        }
        
        int j = nums.length-1;
        if(i>=0) {
            while(j>=0 && nums[j]<=nums[i]) {
                j--;
            }
            swap(nums, i, j);
        }
        
        reverse(nums, i+1, nums.length-1);
    }
    
    void swap(int[] nums, int i, int j) {
        int temp = nums[i];
        nums[i] = nums[j];
        nums[j] = temp;
    }
    
    void reverse(int[] nums, int start, int end) {
        while(start<end) {
            swap(nums, start++, end--);
        }
    }
}
