//Pass structure to function (by value & by reference)
#include <iostream>
using namespace std;

struct Student {
    string name;
    int roll;
    float marks;
};

// By value
void printByValue(Student s) {
    cout << "\n(By Value) Student: " << s.name << ", Roll: " << s.roll << ", Marks: " << s.marks << endl;
}

// By reference
void printByReference(Student &s) {
    cout << "\n(By Reference) Student: " << s.name << ", Roll: " << s.roll << ", Marks: " << s.marks << endl;
}

int main() {
    Student s = {"Ravi", 101, 88.5};

    printByValue(s);
    printByReference(s);

    return 0;
}
