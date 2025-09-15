#include <iostream>
using namespace std;

struct student {
    int id;
    char name[50];
    float marks;
};

int main() {
    struct student s1;

    cout << "Enter the id: ";
    cin >> s1.id;

    cout << "Enter the name: ";
    cin >> s1.name;

    cout << "Enter the marks: ";
    cin >> s1.marks;

    cout << "\n--- Student Details ---\n";
    cout << "ID: " << s1.id << endl;
    cout << "Name: " << s1.name << endl;
    cout << "Marks: " << s1.marks << endl;

    return 0;
}
