class Solution {
    public boolean isValidSerialization(String preorder) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < preorder.length(); i++) {

            char ch = preorder.charAt(i);

            if (ch == ',') continue;

            if (ch == '#') {
                st.push('#');
            } 
            else { 
                
                while (i + 1 < preorder.length() && Character.isDigit(preorder.charAt(i + 1))) {
                    i++;
                }
                st.push('N');   
            }

            while (st.size() > 1 && st.peek() == '#') {

                char c = st.pop(); 
                char d = st.pop(); 

                if (c == '#' && d == '#') {
                    if (st.isEmpty()) return false;
                    st.pop();       
                    st.push('#');   
                } else {
                    st.push(d);
                    st.push(c);
                    break;
                }
            }
        }

        return st.size() == 1 && st.peek() == '#';
    }
}
