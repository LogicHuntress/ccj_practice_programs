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

    int temp = arr[0];  // store first element

    for (i = 0; i < n - 1; i++) {
        arr[i] = arr[i + 1];  // shift left
    }
    arr[n - 1] = temp;  // put first element at end

    printf("Array after left rotation: ");
    for (i = 0; i < n; i++) {
        printf("%d ", arr[i]);
    }
    printf("\n");

    return 0;
}
