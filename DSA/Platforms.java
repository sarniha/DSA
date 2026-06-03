import java.util.*;
class Solution {
    public int platforms(int[] arrival, int[] departure) {
        int platform=1;
        int count=1;int i=1;int j=0;
        int n=arrival.length;
        Arrays.sort(arrival);
        Arrays.sort(departure);
        while(i<n&&j<n){
            if(arrival[i]<=departure[j]){
                platform++;
                i++;
            }
            else{
                platform--;
                j++;
            }
            count=Math.max(count,platform);
        }
        return count;
        
}
}

public class Platforms {
    public static void main(String[] args) {
        Solution sol = new Solution();
        System.out.println(sol.platforms(
            new int[]{900, 940, 950, 1100, 1500, 1800},
            new int[]{910, 1200, 1120, 1130, 1900, 2000}
        )); // Expected: 3
    }
}