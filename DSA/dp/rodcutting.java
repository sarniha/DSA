import java.util.*;

public class rodcutting {
    static int[] nums = new int[1001];
    static int[][] dp = new int[1001][1001];

    static int rec(int l, int r) {
        if (l + 1 == r) return 0;
        if (dp[l][r] != -1) return dp[l][r];
        int ans = Integer.MAX_VALUE;
        for (int p = l + 1; p < r; p++) {
            ans = Math.min(ans, nums[r] - nums[l] + rec(l, p) + rec(p, r));
        }
        return dp[l][r] = ans;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        for (int[] d : dp) Arrays.fill(d, -1);
        for (int i = 0; i < m; i++) nums[i] = sc.nextInt();
        System.out.println(rec(0, m - 1));
    }
}