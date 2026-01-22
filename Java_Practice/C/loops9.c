//sum of first N natural numbers squares.
/*#include<stdio.h>
int main()
{
    int n, sum = 0; 
    printf("ENTER N: ");
    scanf("%d",&n);

    for(int i = 1; i<=n; i++){
        sum += i*i;
    }
    printf("the sum of n natural numbers are %d = %d\n ", n, sum);

    return 0;

}*/

#include <stdio.h>
int main() {
    int n, sum = 0;
    printf("ENTER N: ");
    scanf("%d", &n);

    for(int i = 1; i <= n; i++) {
        sum += i*i;
        if(i < n) {
            printf("%d^2 + ", i);   // print number with +
        } else {
            printf("%d^2", i);      // last number without +
        }
    }

    printf(" = %d\n", sum);  // final sum
    return 0;
}
