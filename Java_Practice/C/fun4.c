#include <stdio.h>

// function to find largest element
int largest(int arr[], int n) {
    int max = arr[0];   // assume 
    for (int i = 1; i < n; i++) {
        if (arr[i] > max) {
            max = arr[i];   
        }
    }
    return max;
}

int main() {
    int n;
    printf("Enter size of array: ");
    scanf("%d", &n);

    int arr[n];
    printf("Enter %d elements: ", n);
    for (int i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
    }

    int result = largest(arr, n);
    printf("Largest element = %d\n", result);

    return 0;
}
