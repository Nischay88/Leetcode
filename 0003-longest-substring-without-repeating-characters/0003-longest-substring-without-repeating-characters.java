class Solution {
    public int lengthOfLongestSubstring(String s) {

        HashSet<Character> hm = new HashSet<>();
        int max = 0;
        int i = 0;
        int j = 0;

        while (i < s.length() && j < s.length()) {
            if (!hm.contains(s.charAt(j))) {
                hm.add(s.charAt(j));
                max = Math.max(max, j - i + 1);
                j++;
            } else {
                hm.remove(s.charAt(i));
                i++;
            }
        }

        return max;
    }
}