class Solution {
    private boolean isOpenBracket(char ch){
        return ch=='(' || ch=='{' || ch=='[';
    }
    public boolean isValid(String s) {
        Stack<Character> st=new Stack<>();
        for(char ch: s.toCharArray()){
            if(isOpenBracket(ch)) st.push(ch);
            else{
                if(st.isEmpty()) return false;
                if((ch==')' && st.peek()=='(')
                || (ch=='}' && st.peek()=='{')
                || (ch==']' && st.peek()=='[')) st.pop();
                else return false;
            }
        }
        return st.isEmpty();
    }
}