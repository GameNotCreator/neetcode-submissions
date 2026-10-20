class Solution {
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<HashMap<Character, Integer>, List<String>> h = new HashMap<>(); 
        for(String s : strs){
            HashMap<Character, Integer> t = new HashMap<>();
            for(Character c : s.toCharArray()){
                t.put(c, t.getOrDefault(c, 0) + 1);
            }
            h.computeIfAbsent(t, e -> new ArrayList<String>()).add(s);
        }
        List<List<String>> out = new ArrayList<>(h.values());
        out.sort((a,b) -> Integer.compare(a.size(), b.size()));
        return out;
    }
}
