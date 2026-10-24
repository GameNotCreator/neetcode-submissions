class Solution {
    public boolean isValid(String s) {
        if(s.length() % 2 != 0) return false;
        if(s.isEmpty()) return true;
        ArrayList<Character> stack = new ArrayList<>();
        for(Character c : s.toCharArray()){
            if(c == '[' || c == '{' || c == '(')
                stack.add(c);
            else{
            if(stack.isEmpty()) return false;
            switch(c) {
                case ']':
                    if(stack.get(stack.size() - 1) != '[') return false;
                    else stack.remove(stack.size() - 1);
                    break;
                case '}':
                    if(stack.get(stack.size() - 1) != '{') return false;
                    else stack.remove(stack.size() - 1);
                    break;
                case ')':
                    if(stack.get(stack.size() - 1) != '(') return false;
                    else stack.remove(stack.size() - 1);
                    break;
                default:
                    return false;
            }
        }
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
