#include<stdio.h>
int main()
{
    int arr[5] = {2,4,6,45,1};
    int max = arr[0];
    int min = arr[0];
    for(int i = 0; i<5; i++){
        if(arr[i]>max)
          max = arr[i];
        if(arr[i]<min)
          min = arr[i];

    }
    printf("the largest number = %d\n",max);
    printf("the smallest number = %d\n",min);

    return 0;
}