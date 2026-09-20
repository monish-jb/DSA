class Solution {
    public int timeRequiredToBuy(int[] tickets, int k) {
        Queue<Integer> q=new ArrayDeque();
        for(int i=0;i<tickets.length;i++){
            q.offer(i);
        }
        int time=0;
        while(!q.isEmpty()){
            int i=q.poll();
            tickets[i]--;
            time++;
            if(i==k && tickets[k]==0){
                return time;
            }
            if(tickets[i]>0){
                q.offer(i);
            }
        }
        return time;
    }
}