class Solution {
    public int binarySearch(int[] arr, int target) {
        return search(arr, target, 0, arr.length - 1);
    }

    private int search(int[] arr, int target, int lo, int hi) {
        if (lo > hi) return -1; // not found

        int mid = lo + (hi - lo) / 2; // avoids overflow vs (lo+hi)/2

        if (arr[mid] == target) {
            return mid;
        } else if (arr[mid] < target) {
            return search(arr, target, mid + 1, hi);
        } else {
            return search(arr, target, lo, mid - 1);
        }
    }
}