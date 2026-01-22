#include<stdio.h>
int main()
{
    int arr[5] = {10,20,30,50,40};
    int sum = 0;
    float average;
    for(int i = 0; i<5; i++)
    {
        sum += arr[i];
    }
    average = sum/5.0;

    printf("the sum of :%d\n",sum);
    printf("the average of :%.2f\n",average);
    return 0;

}