class Solution {
    public int longestValidParentheses(String s) {
        int n=s.length();
        int res=0,open=0,close=0;
        for(char ch: s.toCharArray()){
            if(ch=='(') open++;
            else{
                close++;
            }

            if(open==close) res=Math.max(res,open+close);
            else if(open<close){
                open=0;close=0;
            }
        }
        open=0;close=0;
        for(int i=n-1;i>=0;i--){
            char ch=s.charAt(i);
            if(ch=='(') open++;
            else{
                close++;
            }

            if(open==close) res=Math.max(res,open+close);
            else if(open>close){
                open=0;close=0;
            }
        }
        return res;
    }
}