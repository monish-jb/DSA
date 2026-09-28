class Solution {
    public int maxDepth(String s) {
        int count=0;
        int mcount=0;
        for(char a:s.toCharArray()){
            if(a==')'){
                count--;
            }
            else if(a=='('){
                count++;
                mcount=Math.max(count,mcount);
            }
        }
        return mcount;
    }
}