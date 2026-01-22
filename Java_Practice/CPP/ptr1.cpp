#include<iostream>
using namespace std;
int main()
{
    int num = 10;
    int *ptr;
    ptr = &num;

    cout<<"the value of num is : "<<num<<endl;
    cout<<"the address of num is : "<<&num<<endl;
    cout<<"The value of pointer *ptr is : "<<*ptr<<endl;
    cout<<"The value of pointer adress is ptr : "<<ptr<<endl;
    return 0;
}