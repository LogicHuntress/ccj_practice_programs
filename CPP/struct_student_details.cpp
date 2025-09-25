//Structure for Student (input details of one student)
#include <iostream>
using namespace std;

struct Student {
    string name;
    int roll;
    float marks;
};

int main() {
    Student s;

    cout << "Enter name: ";
    cin >> s.name;
    cout << "Enter roll number: ";
    cin >> s.roll;
    cout << "Enter marks: ";
    cin >> s.marks;

    cout << "\nStudent Details:\n";
    cout << "Name: " << s.name << "\nRoll: " << s.roll << "\nMarks: " << s.marks << endl;

    return 0;
}
