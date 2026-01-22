//Fibonacci using Function
#include<stdio.h>

int Fibonacci(int n) {
    int a = 0, b = 1, next;

    if(n == 0) return 0;
    if(n == 1) return 1;

    for(int i =2 ; i<=n; i++){
        next = a+b;
        a = b;
        b = next;
    }
    return b;


}
int main() {
    int n;

    printf("Enter n: ");
    scanf("%d", &n);

 printf("The %dth Fibonacci number is %d\n", n, Fibonacci(n));

    return 0;
}