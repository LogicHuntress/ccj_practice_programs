#include<stdio.h>
int add(int a, int b){
    return (a+b);
}
int main(){
    int a = 5, b = 10;
    int sum;
    sum = add(5,10);
    printf("the addition of two numbers is :%d",sum);
    return 0;
}