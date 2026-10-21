class Solution {
    public int[] productExceptSelf(int[] nums) {
        int l = nums.length;
        int[] out = new int[l];

        int p = 1; 
        for(int i = 0; i < l; i++){
            out[i] = p;
            p = p * nums[i];
        }
        p = 1;
        for(int i = l - 1; i >= 0; i--){
            out[i] = out[i] * p;
            p = p * nums[i];
        }
        return out;
    }
}  
