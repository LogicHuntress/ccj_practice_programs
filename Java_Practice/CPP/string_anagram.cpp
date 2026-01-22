//Anagram Check
#include <iostream>
#include <algorithm>
using namespace std;

int main() {
    string str1, str2;
    cout << "Enter first string: ";
    getline(cin, str1);
    cout << "Enter second string: ";
    getline(cin, str2);

    if(str1.length() != str2.length()) {
        cout << "Not an anagram\n";
    } else {
        sort(str1.begin(), str1.end());
        sort(str2.begin(), str2.end());
        if(str1 == str2) cout << "Anagram\n";
        else cout << "Not an anagram\n";
    }
    return 0;
}
