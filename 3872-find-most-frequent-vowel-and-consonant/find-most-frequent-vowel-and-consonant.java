class Solution {
    public int maxFreqSum(String s) {
        int[] a=new int[26];
        for(char c:s.toCharArray()){
            a[c-'a']++;
        }
        int vmax=0;
        int cmax=0;
        for(int i=0;i<26;i++){
            if(i==0 || i==4 || i==8 || i==14 || i==20){
                vmax=Math.max(vmax,a[i]);
            }
            else{
                cmax=Math.max(cmax,a[i]);
            }
        }
        return cmax+vmax;
    }
}