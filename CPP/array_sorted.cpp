#include<iostream>
using namespace std;
int main()
{
    int arr[5] = {2,4,6,8,10};
    int isASC = arr[1];
    int isDSC = arr[1];
    for(int i = 0; i<4; i++){
        if(arr[i]>arr[i+1])
          isASC = 0;
        if(arr[i]<arr[i+1])
          isDSC = 0;
    }
    if(isASC){
        cout<<"This is Ascending sorted..! "<<endl;
    }
    else if(isDSC){
        cout<<"This is dscending sorted..! "<<endl;
    }
    else {
       cout<<"NOT sorted ..!"<<endl;
    }
    return 0;
    

}