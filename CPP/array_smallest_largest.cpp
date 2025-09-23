#include<iostream>
using namespace std;
int main()
{
    int arr[5] = { 2,7,4,98,1};
    int max = arr[0];
    int min = arr[0];
    for(int i = 0; i<5; i++){
        if(arr[i]>max)
           max = arr[i];
        if(arr[i]<min)
           min = arr[i];
    }
    cout<<"the largest number : "<<max<<endl;
    cout<<"the smallest number : "<<min<<endl;

    return 0;

}