class Solution {
    public int maxProfit(int[] prices) {
        HashSet<Integer> h = new HashSet<>();
        for(int i = 0; i < prices.length; i++){
            for(int j = i + 1; j < prices.length; j++){
                h.add(prices[j] - prices[i]);
            }
        }
        int max = 0;
        for(Integer i : h){
            if(i > 0 && i > max){
                max = i;
            }
        }
        return max;
    }
}
