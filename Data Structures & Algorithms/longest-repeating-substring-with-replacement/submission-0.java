class Solution {
    public int characterReplacement(String s, int k) {
        int max = 0;
        int left = 0;
        int right = 0;
        int[] compte = new int[26];

        while (right < s.length()) {
            compte[s.charAt(right++) - 'A']++;

            int frequenceMax = 0;
            for (int nombre : compte) {
                frequenceMax = Math.max(frequenceMax, nombre);
            }

            while ((right - left) - frequenceMax > k) {
                compte[s.charAt(left) - 'A']--;
                left++;

                frequenceMax = 0;
                for (int nombre : compte) {
                    frequenceMax = Math.max(frequenceMax, nombre);
                }
            }

            max = Math.max(max, right - left);
        }

        return max;
    }
}