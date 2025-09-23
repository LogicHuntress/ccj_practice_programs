#include <stdio.h>

int main() {
    int n, i;
    printf("Enter size of sorted array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements (sorted): ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int j = 0; // index for unique elements
    for (i = 0; i < n - 1; i++) {
        if (arr[i] != arr[i + 1]) {
            arr[j] = arr[i];
            j++;
        }
    }
    // copy last element
    arr[j] = arr[n - 1];
    j++;

    printf("Array after removing duplicates: ");
    for (i = 0; i < j; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
