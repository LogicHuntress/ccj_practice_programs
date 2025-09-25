//Allocate memory using calloc() and compare with malloc()
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n;
    printf("Enter size: ");
    scanf("%d", &n);

    int *arr_malloc = (int*)malloc(n * sizeof(int));
    int *arr_calloc = (int*)calloc(n, sizeof(int));

    printf("Values using malloc(): ");
    for(int i=0; i<n; i++) printf("%d ", arr_malloc[i]);

    printf("\nValues using calloc(): ");
    for(int i=0; i<n; i++) printf("%d ", arr_calloc[i]);

    free(arr_malloc);
    free(arr_calloc);
    return 0;
}
