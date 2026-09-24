class Solution {
    public int wtrue(int a){
        if(a<10)return a;
        int sum=0;
        while(a>0){
            sum+=a%10;
            a/=10;
        }
        return sum;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            int c=wtrue(nums[i]);
            if(i==c)return i;
        }
        return -1;
    }
}