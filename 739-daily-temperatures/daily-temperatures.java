class Solution {
    public int[] dailyTemperatures(int[] temperatures) {
        int n=temperatures.length;
        Stack<Integer> stack=new Stack();
        int[] a =new int[n];
        for(int i=0;i<n;i++){
            while(!stack.isEmpty() && temperatures[i]>temperatures[stack.peek()]){
                int c=stack.pop();
                a[c]=i-c;
            }
            stack.push(i);
        }
        return a;
    }
}