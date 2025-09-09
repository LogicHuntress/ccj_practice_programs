#include<iostream>
using namespace std;

int add(int a, int b){
    return (a+b);
}
int main()
{
    int a = 15, b = 35;
    int sum;
    sum = add(15,35);

    cout<<"the sum and addition of two numbers are : "<<sum<<endl;
    return 0; 

}