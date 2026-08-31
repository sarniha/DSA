class Solution {
    public int minele(int[] arr, int idx, int currmin) {
        if (idx == arr.length) return currmin;
        currmin= Math.min(currmin, arr[idx]);
        return minele(arr, idx + 1, currmin);
    }
}