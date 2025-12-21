class Solution {
    public int minDeletionSize(String[] strs) {
        int cnt = 0;
        int rows = strs.length;
        int cols = strs[0].length();

        for (int c = 0; c < cols; c++) {
            for (int r = 0; r < rows - 1; r++) {
                if (strs[r].charAt(c) > strs[r + 1].charAt(c)) {
                    cnt++;          
                    break;          
                }
            }
        }
        return cnt;
    }
}
