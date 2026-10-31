class Solution {
    public int climbStairs(int n) {
        if(n==0) return 0; 
        if(n==1) return 1;
        if(n==2) return 2;

        int un = 1;
        int deux = 2;

        for (int marche = 3; marche <= n; marche++) {
            int actuel = un + deux;
            un = deux;
            deux = actuel;
        }

        return deux;
    }
}
