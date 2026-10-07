class Solution {
    public int minAddToMakeValid(String s) {
        Stack<Character> st=new Stack<>();
        int count=0;
        for(char ch: s.toCharArray()){
            if(ch==')'){
                if(st.size()==0) count++;
                else st.pop();
            }
            else{
                st.push(ch);
            }
        }
        return count+st.size();
    }
}