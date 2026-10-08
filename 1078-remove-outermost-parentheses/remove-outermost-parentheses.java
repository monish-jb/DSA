class Solution {
    public String removeOuterParentheses(String s) {
        String c="";
        int depth=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                if(depth>0){
                    c+=a;
                }
                depth++;
            }
            else{
                depth--;
                if(depth>0){
                    c+=a;
                }
            }
        }
        return c;
    }
}