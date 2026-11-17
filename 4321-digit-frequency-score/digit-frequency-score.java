class Solution {
    public int digitFrequencyScore(int n) {
        int[] a=new int[11];
        int b=n;
        int i=0;
        while(b>0){
            int c=b%10;
            b/=10;
            a[c]++;
        }
        int sum=0;
        i=0;
        while(i<11){
            sum+=(i*a[i]);
            i++;
        }
        return sum;
    }
}