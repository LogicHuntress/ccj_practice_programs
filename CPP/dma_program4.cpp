//Allocate memory for a string and store sentence
#include <iostream>
using namespace std;

int main() {
    char *str = new char[100];

    cout << "Enter a sentence: ";
    cin.ignore(); // Ignore leftover newline
    cin.getline(str, 100);

    cout << "You entered: " << str << endl;

    delete[] str;
    return 0;
}
