class Solution {
    public boolean isOther(int start, int value, int[] nums){
        for(int i = start; i < nums.length; i++)
            if(nums[i] == value)
                return true;
        return false;
    }
    public boolean hasDuplicate(int[] nums) {
        int l = nums.length;
        for(int i = 0; i < l; i++)
                if((i + 1 < l) && isOther(i + 1, nums[i], nums))
                    return true;
        return false;
    }
}