#include <stdio.h>

int fibonacci(int n) {
    if (n == 0)  // base case
        return 0;
    else if (n == 1)  // base case
        return 1;
    else
        return fibonacci(n - 1) + fibonacci(n - 2); // recursive call
}

int main() {
    int n;
    printf("Enter n: ");
    scanf("%d", &n);

    printf("Fibonacci term = %d\n", fibonacci(n));

    return 0;
}
