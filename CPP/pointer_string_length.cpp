//Calculate the length of a string without built-in functions, using pointers
#include <iostream>
using namespace std;
int main() {
    char str[] = "bujji";
    char *p = str;
    int length = 0;
    while(*p != '\0') {
        length++;
        p++;
    }
    cout << "Length = " << length << endl;
    return 0;
}
