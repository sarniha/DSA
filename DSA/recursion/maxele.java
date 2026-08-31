class Solution {
    public int maxele(int[] arr, int idx, int currmax) {
        if (idx == arr.length) return currmax;
        currmax = Math.max(currmax, arr[idx]);
        return maxele(arr, idx + 1, currmax);
    }
}