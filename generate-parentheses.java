class Solution {
    public List<String> generateParenthesis(int n) {
        List<String> res = new ArrayList<>();
        StringBuilder builder = new StringBuilder();
        parenthesis(res, builder, 0, 0, n);
        return res;
    }
    
    void parenthesis(List<String> res, StringBuilder current, int open, int close, int n) {
        if(open == n && close == n) {
            res.add(current.toString());
            return;
        }
        
        if(open < n) {
            parenthesis(res, current.append("("), open+1, close, n);
            current.deleteCharAt(current.length()-1);
        }
        
        if(close < open) {
            parenthesis(res, current.append(")"), open, close+1, n);
            current.deleteCharAt(current.length()-1);
        }
    }
}
