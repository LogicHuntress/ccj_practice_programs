//Structure for Employee (array of structures)
#include <iostream>
using namespace std;

struct Employee {
    string name;
    int id;
    float salary;
};

int main() {
    int n;
    cout << "Enter number of employees: ";
    cin >> n;

    Employee emp[n];

    for(int i=0; i<n; i++) {
        cout << "\nEnter details of employee " << i+1 << endl;
        cout << "Name: ";
        cin >> emp[i].name;
        cout << "ID: ";
        cin >> emp[i].id;
        cout << "Salary: ";
        cin >> emp[i].salary;
    }

    cout << "\nEmployee Details:\n";
    for(int i=0; i<n; i++) {
        cout << "Name: " << emp[i].name << ", ID: " << emp[i].id << ", Salary: " << emp[i].salary << endl;
    }

    return 0;
}
