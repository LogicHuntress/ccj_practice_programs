//sum of first N natural numbers.
/*#include<stdio.h>
int main()
{
    int n, sum = 0; 
    printf("ENTER N: ");
    scanf("%d",&n);

    for(int i = 1; i<=n; i++){
        sum += i;
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
        sum += i;
        if(i < n) {
            printf("%d + ", i);   // print number with +
        } else {
            printf("%d", i);      // last number without +
        }
    }

    printf(" = %d\n", sum);  // final sum
    return 0;
}
