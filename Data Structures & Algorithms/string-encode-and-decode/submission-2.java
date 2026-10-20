class Solution {

    public String encode(List<String> strs) {
        String out = "[";
        for(String s : strs){
            out = out + "~" + s + "~";
        }
        out = out + "]";
        return out; 
    }

    public List<String> decode(String str) {
        List<String> out = new ArrayList<>();
        boolean b1 = false;
        String s = "";
        for(Character c : str.toCharArray()){
            if (c == '~' && !b1){
                b1 = true;
            } else if (c == '~' && b1){
                b1 = false;
                out.add(s);
                s = "";
            } else if (b1){
                s += String.valueOf(c);
            }
        }
        return out;
    }
}
