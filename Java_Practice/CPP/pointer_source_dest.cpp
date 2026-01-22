//Copy one string to another using pointers
#include<iostream>
using namespace std;
int main() {
    char source[100], dest[100];
    char *src, *dst;
    cout<<"Enter the name of string : "<<endl;
    cin>>source;

    src = source; // pointer to source
    dst = dest; // pointer to destination

    while(*src !='\0') {
        *dst = *src;  // copy character
        src++;
        dst++;
    }
    *dst = '\0';
    cout<<"Destination string : "<<dest<<endl;

    return 0;

}