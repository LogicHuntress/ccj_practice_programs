#include<stdio.h>
int factorial(int n){
    if(n==0 || n==1){
        return 1; 
    }

    else {
        return n * factorial(n-1);
    }
}
int main()
{
    int num;
    printf("enter a number :");
    scanf("%d",&num);

    int result = factorial(num);

    printf("the factorial of num is :%d = %d",num,result);
    return 0;
}
