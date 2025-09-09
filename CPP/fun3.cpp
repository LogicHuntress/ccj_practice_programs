#include<iostream>
using namespace std;
int isprime(int n){
    if(n<=1)
    return 0;  // not prime
for (int i = 2 ; i<=n/2; i++)
{
    if(n % i == 0)
    return 0;  // not prime
}
return 1;   // prime

}
int main(){
    int n;
    cout<<"enter a na value : "<<endl;
    cin>>n;
    int result = isprime(n); // calling function 

    if(result)
    cout<<n<<"is the prime number "<<endl;
    else 
    cout<<n<<"is not a prime number "<<endl;
    return 0;

}