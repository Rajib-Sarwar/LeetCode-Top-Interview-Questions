class Solution {
    public void sortColors(int[] nums) {
        int p0 = 0, current = 0;
        int p2 = nums.length - 1;
        int temp;
        while(current <= p2) {
            if(nums[current] == 0) {
                temp = nums[p0];
                nums[p0++] = 0;
                nums[current++] = temp;
            } else if(nums[current] == 2) {
                temp = nums[p2];
                nums[p2--] = 2;
                nums[current] = temp;
            } else {
                current++;
            }
        }
    }
}
