// sum of first N natural numbers
#include<iostream>
using namespace std;
int main()
{
    int n, sum  = 0;
    cout<<"ENTER N : ";
    cin>>n;
    for(int i = 1; i<=n; i++){
        sum += i;

        cout<<"sum of first N natural numbers are : "<<sum<<endl;

    }
    return 0;
    
}