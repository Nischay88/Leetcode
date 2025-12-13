class Solution {
    public int countDistinctIntegers(int[] nums) {
        ArrayList<Integer> list = new ArrayList<>();
 
       for(int i = 0 ; i < nums.length ; i++){
          
          list.add(nums[i]);
       }

       for(int i : nums){

        int x = i;
        int sum = 0 ;
        while(x > 0){

           int rem = x % 10;
           sum = sum*10 + rem;
           x = x/10;
        }
        list.add(sum);
       }

       HashSet<Integer> hs = new HashSet<>();
       for(int i : list){
        hs.add(i);
       }

       return hs.size();
    }
}