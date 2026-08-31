class Solution {
    public boolean isSorted(int[] arr) {
        return isSorted(arr, 0);
    }

    private boolean isSorted(int[] arr, int idx) {
        // base case: reached the last element (or array has 0/1 elements)
        if (idx == arr.length - 1 || arr.length == 0) return true;

        // if current element is greater than next, not sorted
        if (arr[idx] > arr[idx + 1]) return false;

        // check the rest of the array
        return isSorted(arr, idx + 1);
    }
}