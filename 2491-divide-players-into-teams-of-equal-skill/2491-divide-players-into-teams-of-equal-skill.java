class Solution {
    public long dividePlayers(int[] skill) {
        if(skill.length % 2 != 0) return -1;
        Arrays.sort(skill);

        int t = skill[0]+skill[skill.length-1];
   
    long sum1 =  skill[0]*skill[skill.length-1];
       int i = 1;
       int j = skill.length - 2;

       while(i < j){
       
        if(skill[i]+ skill[j] != t){
            return -1;
        }
        sum1 = sum1 + (long)(skill[i]*skill[j]);
        i++;
        j--;
       }

       return sum1;
    }
}