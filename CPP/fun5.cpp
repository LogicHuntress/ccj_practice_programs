#include <iostream>
#include <string>
using namespace std;

void reverse(string &str) {
    int n = str.length();
    for (int i = 0; i < n / 2; i++) {
        swap(str[i], str[n - i - 1]);
    }
}

int main() {
    string str;
    cout << "Enter a string: ";
    cin >> str;

    reverse(str);
    cout << "Reversed string = " << str << endl;

    return 0;
}
