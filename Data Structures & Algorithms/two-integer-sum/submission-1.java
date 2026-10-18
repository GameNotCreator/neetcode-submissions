class Solution {
    public int[] twoSum(int[] nums, int target) {
        int s = nums.length;
        int[] out = new int[2];
        for(int i = 0; i < s; i++){
            for(int j = i; j < s; j++){
                if(i != j && (nums[j] + nums[i]) == target){
                    out[0] = i;
                    out[1] = j;              
                    return out;
                }
            }
        }
        throw new IllegalArgumentException();
    }
}
