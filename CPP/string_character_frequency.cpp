// Character Frequency Count
#include<iostream>
using namespace std;
int main() {
    char str[100];
    int freq[256] = {0}; // assumption

    cout<<"enter string name : "<<endl;
    cin>>str;
    for(int i = 0; str[i] !='\0'; i++) {
        char ch = str[i];
        freq[ch]++;

    }

    for(int i = 0; str[i] !='\0'; i++) {
        char ch = str[i];
        if (freq[ch] != 0) {
            cout<<ch<< " - "<<freq[ch]<<endl;
            freq[ch] = 0;
        }

    }
    return 0;

}
