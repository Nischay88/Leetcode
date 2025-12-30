class Solution {
    public int numMagicSquaresInside(int[][] grid) {
        int cnt = 0;

        for(int i = 0; i <= grid.length - 3; i++) {
            for(int j = 0; j <= grid[0].length - 3; j++) {

                boolean[] seen = new boolean[10];

                boolean valid = true;
                for(int r = i; r < i + 3; r++) {
                    for(int c = j; c < j + 3; c++) {
                        int val = grid[r][c];
                        if(val < 1 || val > 9 || seen[val]) {
                            valid = false;
                            break;
                        }
                        seen[val] = true;
                    }
                    if(!valid) break;
                }

                if(!valid) continue;

                int r1 = grid[i][j] + grid[i][j+1] + grid[i][j+2];
                int r2 = grid[i+1][j] + grid[i+1][j+1] + grid[i+1][j+2];
                int r3 = grid[i+2][j] + grid[i+2][j+1] + grid[i+2][j+2];

                int c1 = grid[i][j] + grid[i+1][j] + grid[i+2][j];
                int c2 = grid[i][j+1] + grid[i+1][j+1] + grid[i+2][j+1];
                int c3 = grid[i][j+2] + grid[i+1][j+2] + grid[i+2][j+2];

                int d1 = grid[i][j] + grid[i+1][j+1] + grid[i+2][j+2];
                int d2 = grid[i][j+2] + grid[i+1][j+1] + grid[i+2][j];

                if(r1 == r2 && r2 == r3 &&
                   r1 == c1 && c1 == c2 && c2 == c3 &&
                   r1 == d1 && d1 == d2) {
                    cnt++;
                }
            }
        }
        return cnt;
    }
}
