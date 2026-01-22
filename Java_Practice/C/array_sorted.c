#include <stdio.h>

int main() {
    int n, i;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int isAsc = 1, isDesc = 1;

    for (i = 0; i < n - 1; i++) {
        if (arr[i] > arr[i + 1])
            isAsc = 0;
        if (arr[i] < arr[i + 1])
            isDesc = 0;
    }

    if (isAsc)
        printf("Array is sorted in ascending order.\n");
    else if (isDesc)
        printf("Array is sorted in descending order.\n");
    else
        printf("Array is NOT sorted.\n");

    return 0;
}
