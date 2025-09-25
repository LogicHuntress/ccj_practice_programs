//Compare two structures
#include <iostream>
using namespace std;

struct Student {
    string name;
    int roll;
    float marks;
};

int main() {
    Student s1 = {"Ravi", 101, 88.5};
    Student s2 = {"Ravi", 101, 88.5};

    if(s1.name == s2.name && s1.roll == s2.roll && s1.marks == s2.marks) {
        cout << "Both students have same data." << endl;
    } else {
        cout << "Students data is different." << endl;
    }

    return 0;
}
