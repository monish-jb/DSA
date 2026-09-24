class Solution {
    public int[] runningSum(int[] nums) {
        int[] a=new int[nums.length];
        int sum=0,i=0;
        for(int num:nums){
            sum+=num;
            a[i++]=sum;
        }
        return a;
    }
}