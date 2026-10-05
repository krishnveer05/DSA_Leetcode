class Solution {
    public int scoreOfParentheses(String s) {
        int depth = 0;
        int res = 0;
        char prev = '(';
        for (char ch : s.toCharArray()) {
            if (ch == '(') {
                depth++;
            } else {
                depth--;
                if (prev == '(') {
                    res += Math.pow(2, depth);
                }
            }
            prev = ch;
        }
        return res;
    }
}