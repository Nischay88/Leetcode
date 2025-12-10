class Solution {
    public int maxOperations(int[] nums, int k) {
        HashMap<Integer,Integer> hm = new HashMap<>();
        int cnt = 0 ;
        for(int i = 0 ; i < nums.length; i++){

            if(hm.containsKey(k-nums[i])){
                cnt++;
                int x = hm.get(k-nums[i]);
                hm.put(k-nums[i], x-1);
                if(hm.get(k-nums[i]) == 0){
                    hm.remove(k-nums[i]);
                }
            }
           else{
              hm.put(nums[i], hm.getOrDefault(nums[i], 0) + 1);
            }

        }

        return cnt;
    }
}