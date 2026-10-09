class Solution {
    public int minInsertions(String s) {
        int need=0;
        int insertions=0;
        for(char a:s.toCharArray()){
            if(a=='('){
                if(need%2==1){
                    need--;
                    insertions++;
                }
                need+=2;
            }
            else {
                need--;
                if(need<0){
                    need=1;
                    insertions++;
                }
            }
        }
        return need+insertions;
    }
}