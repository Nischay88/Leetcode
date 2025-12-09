class Solution {
    public long numberOfWays(String s) {
       
       int[] nums= new int[s.length()];
       for (int i = 0; i < s.length(); i++) {
           nums[i] = s.charAt(i) - '0';
       }

        HashMap<Integer,Integer> back = new HashMap();
        HashMap<Integer,Integer> front =  new HashMap();

        for(int i = 1 ; i < nums.length; i++){
            front.put(nums[i], front.getOrDefault(nums[i],0) + 1);
        }
        
        back.put(nums[0],1);
        long cnt = 0; 

        for(int i = 1 ; i < nums.length -1 ; i++){
 
            front.put(nums[i], front.get(nums[i]) - 1);
            if(front.get(nums[i]) == 0){
                front.remove(nums[i]);
            }

            int b = nums[i];
            int a = (b == 0 ? 1 : 0);
            int c = a;

            if(back.containsKey(a) && front.containsKey(c)){
                long x = front.get(c);
                long y = back.get(a);

                cnt = cnt + x * y;  
            }

            back.put(nums[i], back.getOrDefault(nums[i],0) + 1);
        }

        return cnt;  
    }
}
