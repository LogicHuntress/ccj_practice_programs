#include<iostream>
#include<string>
using namespace std;
int main()
{
    char str[100];
    int count = 0;
    cout<<"enter a str:"<<endl;
    cin>>str;
    while(str[count] !='\0'){
        count++;
    }
    cout<<"the string length is : "<<count<<endl;
    return 0;

}