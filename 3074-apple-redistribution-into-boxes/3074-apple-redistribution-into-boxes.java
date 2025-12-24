class Solution {
    public int minimumBoxes(int[] apple, int[] capacity) {
        
        int sum = 0 ;
        for(int i : apple){
            sum = sum + i;
        }
        
        Arrays.sort(capacity);
        
        int i = capacity.length -1 ;
        int cnt = 0;
        while(sum > 0){

            if(sum >= capacity[i]){
                 sum = sum - capacity[i];
                 cnt++;
            }
            
            else if(sum <= capacity[i]){
                cnt++;
                sum = 0 ;
                break;
            }
            i--;
        }

        return cnt;
    }
}