class Solution {
    public int lengthOfLongestSubstring(String s) {
        int max = 0;
        for(int i = 0; i < s.length(); i++){
            HashSet<Character> m = new HashSet<>();
            int j = i;
            while(j < s.length() && !m.contains(s.charAt(j))){
                m.add(s.charAt(j));
                j++;
            }
            max = Math.max(max, m.size());
        }
        return max;
    }
}
