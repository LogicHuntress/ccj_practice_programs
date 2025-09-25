//Demonstrate difference between malloc() and calloc()
#include <stdio.h>
#include <stdlib.h>

int main() {
    int n = 5;

    int *a = (int*)malloc(n * sizeof(int));
    int *b = (int*)calloc(n, sizeof(int));

    printf("malloc values: ");
    for(int i=0;i<n;i++) printf("%d ", a[i]); // Garbage values

    printf("\ncalloc values: ");
    for(int i=0;i<n;i++) printf("%d ", b[i]); // Initialized to 0

    free(a);
    free(b);
    return 0;
}
