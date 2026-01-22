//Remove Duplicates
#include <iostream>
#include <string>
using namespace std;

int main() {
    string str;
    cout << "Enter a string: ";
    getline(cin, str);

    string result = "";
    for(char ch : str) {
        if(result.find(ch) == string::npos)
            result += ch;
    }
    cout << "String after removing duplicates: " << result << endl;
    return 0;
}
