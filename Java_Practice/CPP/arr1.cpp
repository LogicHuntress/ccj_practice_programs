#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {10,20,30,40,50};
    int sum = 0;
    float average;
    for(int i = 0; i<5; i++){
        sum = sum+arr[i];
    }
    average = sum/5.0;

    cout<<"\nthe sum of array is : "<<sum<<endl;
    cout<<"the average of array is : "<<average<<endl;

    return 0; 


    
}