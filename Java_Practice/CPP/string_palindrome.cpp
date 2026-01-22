//Palindrome Check
#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    bool isPalindrome = true;
    for(int i = 0; i < str.length()/2; i++) {
        if(str[i] != str[str.length()-1-i]) {
            isPalindrome = false;
            break;
        }
    }
    if(isPalindrome) cout << "Palindrome\n";
    else cout << "Not a palindrome\n";

    return 0;
}
