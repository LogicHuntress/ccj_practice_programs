//first N even numbers
#include<iostream>
using namespace std;
int main()
{
    int n;
    cout<<"ENTER N : "<<endl;
    cin>>n;
    for(int i = 1 ; i<=n ; i++){
        cout<<"first N even numbers : "<<2*i<<endl;
    }
    return 0;
}