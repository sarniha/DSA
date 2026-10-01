import java.util.Arrays;

public class Solution {
    int[][] dp;
    String a, b;
    StringBuffer ans;

    Solution(String a, String b) {
        this.a = a;
        this.b = b;
        this.dp = new int[a.length()][b.length()];
        for (int[] d : dp) Arrays.fill(d, -1);
    }

    public int lcs(int i, int j) {
        if (i >= a.length() || j >= b.length()) return 0;
        if (dp[i][j] != -1) return dp[i][j];
        if (a.charAt(i) == b.charAt(j)) {
            ans.append(a.charAt(i));
            return dp[i][j] = 1 + lcs(i+1, j+1);
        }
        return dp[i][j] = Math.max(lcs(i+1, j), lcs(i, j+1));
    }

    public static void main(String[] args) {
        Solution obj = new Solution("abcde", "ace");
        System.out.println(obj.lcs(0, 0)); 
    }
}