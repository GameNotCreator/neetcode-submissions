class Solution {
    public int maxArea(int[] heights) {
        if (heights.length == 0) return 0;
        int max = 0;
        int l = 0;
        int r = heights.length - 1;
        while(l < r){
            int area = Math.min(heights[l], heights[r]) * (r - l);
            if(max < area) {
                max = area;
            }
            if (heights[l] <= heights[r]) {
                l++;
            } else {
                r--;
            }
        }
        return max;

    //     int max = 0;
    //     for(int i = 0; i < heights.length; i++){
    //         for(int j = i + 1; j < heights.length; j++){
    //             if(heights[i] <= heights[j]){
    //                 int a = (heights[i] * (j-i));
    //                 if(a > max){
    //                     max = a;
    //                 }
    //             }else{
    //                 int a = heights[j] * (j-i);
    //                 if(a>max){
    //                     max=a;
    //                 }
    //             }
    //         }
    //     }
    //     return max;
    }
}
