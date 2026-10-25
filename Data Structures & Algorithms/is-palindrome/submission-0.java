class Solution {
    public String clean(String s){
        StringBuilder out = new StringBuilder();
        for(char c : s.toCharArray()){
            if(Character.isLetterOrDigit(c)){
                out.append(c);
            }
        }
        return out.toString();
    }
    public boolean isPalindrome(String s) {
        String p = clean(s).toLowerCase();
        for(int i = 0; i < p.length(); i++){
            if(p.charAt(i) != p.charAt(p.length() - 1 - i))
                return false;
        }
        return true;
    }
}
