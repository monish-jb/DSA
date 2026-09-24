class Solution {
    public int[] buildArray(int[] nums) {
        int[] a=new int[nums.length];
        int i=0;
        for(int num:nums){
            a[i++]=nums[num];
        }
        return a;
    }
}