class Solution {
    public int countVowelSubstrings(String word) {
        int[] a=new int[256];
        char[] b=word.toCharArray();
        List<Character> list=List.of('a','e','i','o','u');
        int count=0;
        for(int i=0;i<b.length;i++){
            int j=i;
            while(j<b.length && list.contains(b[j])){
                a[b[j]]++;
                if(a['a']>0 && a['e']>0 && a['i']>0 && a['o'] >0&& a['u']>0){
                    count++;
                }
                j++;
            }
            Arrays.fill(a,0);
        }
        return count;
    }
}