//first N odd numbers
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"ENTER N : "<<endl;
    cin>>n;
    for(int i = 1 ; i<=n ; i++){
        cout<<"first N odd numbers : "<<2*i-1<<endl;
    }
    return 0;
}