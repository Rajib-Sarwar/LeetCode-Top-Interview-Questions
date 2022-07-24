class Solution {
    public String longestPalindrome(String s) {
        int ans = 0, ans_j = -1, ans_k = -1, n = s.length();
        
        for(int i=0; i<n; i++) {
            int j=i, k=i;
            while(j>=0 && k<n && s.charAt(j) == s.charAt(k)) {
                int temp = k-j+1;
                if(ans < temp) {
                    ans = temp;
                    ans_j = j;
                    ans_k = k;
                }
                j--;
                k++;
            }
            
            j=i; k=i+1;
            while(j>=0 && k<n && s.charAt(j) == s.charAt(k)) {
                int temp = k-j+1;
                if(ans < temp) {
                    ans = temp;
                    ans_j = j;
                    ans_k = k;
                }
                j--;
                k++;
            }
        }
        StringBuilder builder = new StringBuilder();
        for(int i=ans_j; i<=ans_k; i++) {
            builder.append(s.charAt(i));
        }
        return builder.toString();
    }
}
