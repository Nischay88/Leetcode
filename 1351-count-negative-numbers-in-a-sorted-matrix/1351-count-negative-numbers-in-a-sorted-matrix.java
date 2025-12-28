class Solution {
    public int countNegatives(int[][] grid) {
       
       int cnt = 0 ;
       int row = 0 ;
       int col = grid[0].length -1;
         
        while(row < grid.length && col >= 0){
System.out.print(row);
System.out.print(col);
System.out.println(" ");
            if(grid[row][col] < 0){

                cnt = cnt + (grid.length - row);
                System.out.print(cnt);

                col--;
                continue;
            }
            else{
                row++;
               
                continue;
            }
        }
        
        return cnt;
    }
}