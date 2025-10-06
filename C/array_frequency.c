//Count the Frequency of Elements
#include <stdio.h>

int main() {
    int n, arr[100], freq[100], count, i, j;
    printf("Enter number of elements: ");
    scanf("%d", &n);

    printf("Enter array elements: ");
    for (i = 0; i < n; i++) {
        scanf("%d", &arr[i]);
        freq[i] = -1;
    }

    for (i = 0; i < n; i++) {
        count = 1;
        for (j = i + 1; j < n; j++) {
            if (arr[i] == arr[j]) {
                count++;
                freq[j] = 0;
            }
        }
        if (freq[i] != 0)
            freq[i] = count;
    }

    printf("Frequency of elements:\n");
    for (i = 0; i < n; i++) {
        if (freq[i] != 0)
            printf("%d occurs %d times\n", arr[i], freq[i]);
    }
    return 0;
}
