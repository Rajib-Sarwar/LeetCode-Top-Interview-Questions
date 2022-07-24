
class Solution {
    public int lengthOfLongestSubstring(String s) {
        Map<Character, Integer> map = new HashMap<>();
        int ans = 0, i=0;
        
        for(int j=0; j<s.length(); j++) {
            if(map.containsKey(s.charAt(j))) {
                i = Math.max(i, map.get(s.charAt(j))+1); //N.B: always keep the max index
            }
            ans = Math.max(ans, j-i+1);
            map.put(s.charAt(j), j);
        }
        return ans;
    }
}
