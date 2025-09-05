#include<stdio.h>
#include<string.h>
int main()
{
    char str[100];
    int count =0; 
    printf("enter the string : ");
    scanf("%s",&str);
    while(str[count] !='\0'){
        count++;
    }
    printf("the length of string is :%d ",count);
    return 0;
}
