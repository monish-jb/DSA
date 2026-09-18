class Solution {
    public String removeStars(String s) {
        Stack<Character> stack =new Stack();
        for(char a:s.toCharArray()){
            if(a!='*'){
                stack.push(a);
            }
            if(!stack.isEmpty()){
                if(a=='*')stack.pop();
            }
        }
        String str="";
        while(!stack.isEmpty()){
            str+=stack.pop();
        }
        return new StringBuilder(str).reverse().toString();
    }
}