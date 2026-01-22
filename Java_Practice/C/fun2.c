#include<stdio.h>
int fact(int n){
    int fact = 1;
    for(int i = 1; i<=n; i++){
        fact = fact*i;

    }
    return fact;
}
int main()
{
    int n;
    printf("enter a N value :");
    scanf("%d",&n);
    int result = fact(n);  // calling function
    printf("the factorial of N is %d = %d\n", n, result);
    return 0;
}