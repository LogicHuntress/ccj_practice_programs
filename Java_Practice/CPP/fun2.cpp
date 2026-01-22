#include<iostream>
using namespace std;
int fact(int n){
    int fact = 1; 
    for(int i = 1; i<=n; i++){
        fact *= i;

    }
    return fact;
}
int main()
{
    int n;
    cout<<"enter a N value : "<<endl;
    cin>>n;
    int result = fact(n);
    cout<<"the factorial of n is : "<<result<<endl;
    return 0;

}