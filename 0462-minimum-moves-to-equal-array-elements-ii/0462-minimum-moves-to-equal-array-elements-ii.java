class Solution {
    public int minMoves2(int[] nums) {

        Arrays.sort(nums);
        int x = - 1;
        int y = -1;
        if(nums.length % 2 != 0){
                      x = nums[nums.length / 2];
        }
        else{
            x = nums.length/2;
            y = x-1;

            x = (nums[nums.length/2] + nums[x-1])/2;
        }
        
        int sum = 0;
    for(int i = 0 ; i < nums.length; i++){

        sum = sum + Math.abs(x - nums[i]);
    }

    return sum;

    }
}