//Access & modify structure members using pointer
#include <iostream>
using namespace std;

struct Student {
    string name;
    int roll;
    float marks;
};

int main() {
    Student s = {"Ravi", 101, 88.5};
    Student *ptr = &s;

    cout << "Original Name: " << ptr->name << endl;

    ptr->name = "Kiran"; // Modify using pointer
    ptr->marks = 95.0;

    cout << "Modified Name: " << ptr->name << ", Marks: " << ptr->marks << endl;

    return 0;
}
