class Solution {
    public String minRemoveToMakeValid(String s) {
        StringBuilder result = new StringBuilder();
        int open = 0;
        
        for (char c : s.toCharArray()) {
            if (c == '(') {
                open++;
            } else if (c == ')') {
                if (open == 0) {
                    continue;
                }
                open--;
            }
            result.append(c);
        }
        
        StringBuilder finalResult = new StringBuilder();
        for (int i = result.length() - 1; i >= 0; i--) {
            char c = result.charAt(i);
            if (c == '(' && open > 0) {
                open--;
                continue;
            }
            finalResult.append(c);
        }
        
        return finalResult.reverse().toString();
    }
}