class Solution {
    public List<List<Integer>> threeSum(int[] nums) {
        Arrays.sort(nums);
        HashSet<List<Integer>> set = new HashSet<>();
        
        for(int left=0; left<nums.length-2; left++) {
            int mid = left + 1;
            int right = nums.length-1;
            while(mid<right) {
                int sum = nums[left] + nums[mid] + nums[right];
                if(sum < 0) {
                    mid++;
                } else if(sum > 0) {
                    right--;
                } else {
                    set.add(Arrays.asList(nums[left], nums[mid], nums[right]));
                    mid++;
                }
            }
        }
        
        return new ArrayList<>(set);
    }
}
