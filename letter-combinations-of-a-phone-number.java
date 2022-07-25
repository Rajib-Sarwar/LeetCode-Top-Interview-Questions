class Solution {
    public List<String> letterCombinations(String digits) {
        List<String> result = new ArrayList<>();
        if(digits.length() == 0)
            return result;
        
        Map<Character, String> letters = Map.of('2', "abc", 
                                                '3', "def", 
                                                '4', "ghi", 
                                                '5', "jkl", 
                                                '6', "mno", 
                                                '7', "pqrs", 
                                                '8', "tuv", 
                                                '9', "wxyz");
        
        StringBuilder builder = new StringBuilder();
        letterCombinationsRecursive(result, digits, builder, 0, letters);
        return result;
    }
    
    void letterCombinationsRecursive(List<String> result, String digits, StringBuilder current, int index, Map<Character, String> letters) {
        if(index == digits.length()) {
            result.add(current.toString());
            return;
        }
        
        String letter = letters.get(digits.charAt(index));
        for(int i=0; i<letter.length(); i++) {
            letterCombinationsRecursive(result, digits, current.append(letter.charAt(i)), index+1, letters);
            current.deleteCharAt(current.length()-1);
        }
    }
}
