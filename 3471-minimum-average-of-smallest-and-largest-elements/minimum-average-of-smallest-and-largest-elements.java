class Solution {
    public double minimumAverage(int[] nums) {
        double min=Integer.MAX_VALUE;
        int start=0;
        int i=0;
        int end=nums.length-1;
        Arrays.sort(nums);
        while(start<end){
            float a=(float)(nums[start]+nums[end])/2;
            min=Math.min(a,min);
            start++;
            end--;
        }
        return min;
    }
}