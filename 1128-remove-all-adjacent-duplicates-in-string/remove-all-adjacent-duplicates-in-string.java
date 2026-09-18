class Solution {
    public String removeDuplicates(String s) {
        Stack<Character> stack=new Stack();
        for(char a:s.toCharArray()){
            if(stack.isEmpty())stack.push(a);
            else if(!stack.isEmpty()){
                char c=stack.peek();
                if(c!=a)stack.push(a);
                else stack.pop();
            }
        }
        String str="";
        while(!stack.isEmpty())str+=stack.pop();
        return new StringBuilder(str).reverse().toString();
    }
}