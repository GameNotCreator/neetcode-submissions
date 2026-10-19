class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> m = new HashMap<>();
        int[] out  = new int[k];

        for(Integer i : nums){
            m.compute(i, (key, v) -> (v == null) ? 1 : v + 1);
        }
        List<Integer> l = new ArrayList<>(m.keySet());
        l.sort((a,b) -> Integer.compare(m.get(b), m.get(a)));

        for(int i = 0; i < k; i++){
            out[i] = l.get(i);
        }
        return out;
    }
}
