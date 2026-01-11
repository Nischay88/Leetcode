
        class Solution {
    public int maximalRectangle(char[][] matrix) {
        if (matrix == null || matrix.length == 0 || matrix[0].length == 0) {
            return 0;
        }
        
        int rows = matrix.length;
        int cols = matrix[0].length;
        int[] heights = new int[cols];
        int maxArea = 0;
        
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                heights[j] = matrix[i][j] == '1' ? heights[j] + 1 : 0;
             }
            maxArea = Math.max(maxArea, largestRectangleArea(heights));
        }
        
        return maxArea;
    }
public int [] nseright(int [] arr){
        int [] nseright = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        Arrays.fill(nseright,nseright.length);
        for(int i=0; i<arr.length; i++){
            while(st.size()!=0 && arr[i]<arr[st.peek()]){
                int indx = st.pop();
                nseright[indx]=i;
            }
            st.push(i);
        }
        return nseright;
    }
     
      public int [] nseleft(int [] arr){
        int [] nseleft = new int[arr.length];
        Stack <Integer> st = new Stack<>();
        Arrays.fill(nseleft,-1);
        for(int i=arr.length-1;i>=0; i--){
            while(st.size()!=0 && arr[i]<arr[st.peek()]){
                int indx = st.pop();
                nseleft[indx]=i;
            }
            st.push(i);
        }
        return nseleft;
    }



    public int largestRectangleArea(int[] heights) {
        int [] nseright= nseright(heights);
        int [] nseleft = nseleft(heights);

        int ans = -1;

        for(int i=0; i<heights.length;i++){

            int width = (nseright[i]-nseleft[i]-1);

            int area = heights[i]*width;
            ans = Math.max(ans,area);
    
        }
        return ans;
    }
    }

    