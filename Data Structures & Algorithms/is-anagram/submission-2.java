class Solution {
    public static String sorting(String s){
        int size = s.length();
        System.out.println(s);
        char[] ch = s.toCharArray();
        for(int j = 0; j < size; j++){
            char min = ch[j];
            int minI = j;
            for(int i = j; i < size; i++){
                char c = ch[i];
                if (c < min){
                    min = c;
                    minI = i;
                }
            }
            System.out.println(min);
            char temp = ch[j];
            ch[j] = min;
            ch[minI] = temp;
        }
        return String.valueOf(ch);
    }

    public static Map counting(String s){
        HashMap<Character, Integer> m = new HashMap<>();

        for(int i=0; i < s.length(); i++){
            char c = s.charAt(i);
            m.put(c, m.getOrDefault(c, 0) + 1);
        }

        return m;
    }
    public boolean isAnagram(String s, String t) {
        return Solution.counting(s).equals(Solution.counting(t));
    }
}
