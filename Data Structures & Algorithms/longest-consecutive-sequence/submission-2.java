class Solution {
    public int longestConsecutive(int[] nums) {
        HashMap<Integer, Integer> h = new HashMap<>();
        h.put(0,0);
        Arrays.sort(nums);
        for(int i = 0; i < nums.length; i++){
            h.put(nums[i], h.getOrDefault(nums[i]-1, 0) + 1);
        }
        return Collections.max(h.values());
    }
}
