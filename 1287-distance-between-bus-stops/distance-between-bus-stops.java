class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int i=start;
        int j=start;
        int fsum=0;
        int bsum=0;
        while(j!=destination){
            fsum+=distance[j];
            if(j==distance.length-1)j=0;
            else j++;
        }
        while(i!=destination){
            if(i==0)i=distance.length-1;
            else i--;
            bsum+=distance[i];
        }
        return Math.min(fsum,bsum);
    }
}