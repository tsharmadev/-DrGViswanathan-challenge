class Solution {
    public int findJudge(int n, int[][] trust) {
        int[] trustCount = new int[n + 1];
        
        for (int[] relation : trust) {
            trustCount[relation[0]]--; // person trusts someone
            trustCount[relation[1]]++; // person is trusted by someone
        }
        
        for (int i = 1; i <= n; i++) {
            if (trustCount[i] == n - 1) {
                return i;
            }
        }
        return -1;
    }
}