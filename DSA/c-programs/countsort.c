#include <stdio.h>

// Corrected Counting Sort Function
void countsort(int arr[], int max, int n) {

    int count[max + 1];   // +1 because values go from 0 to max
    int b[n];

    // Step 1: Initialize count array with 0
    for (int i = 0; i <= max; i++)
        count[i] = 0;

    // Step 2: Store frequency of each element
    for (int i = 0; i < n; i++)
        ++count[arr[i]];

    // Step 3: Prefix sum (cumulative count)
    for (int i = 1; i <= max; i++)
        count[i] += count[i - 1];

    // Step 4: Build the output array (stable)
    for (int i = n - 1; i >= 0; i--) {
        b[count[arr[i]] - 1] = arr[i];
        count[arr[i]]--;
    }

    // Step 5: Copy sorted data back to original array
    for (int i = 0; i < n; i++)
        arr[i] = b[i];
}

int main() {

    int a[] = {1, 2, 0, 2, 3, 5, 5, 7, 2, 1, 9, 3};
    int n = 12;
    int max = 9;

    countsort(a, max, n);

    for (int i = 0; i < n; i++)
        printf("%d ", a[i]);

    return 0;
}
