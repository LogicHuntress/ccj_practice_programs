//Demonstrate difference between uninitialized & zero-initialized array
#include <iostream>
using namespace std;

int main() {
    int n = 5;

    int *a = new int[n];        // Uninitialized
    int *b = new int[n]();      // Zero-initialized

    cout << "Uninitialized array: ";
    for(int i=0;i<n;i++) cout << a[i] << " ";

    cout << "\nZero-initialized array: ";
    for(int i=0;i<n;i++) cout << b[i] << " ";

    delete[] a;
    delete[] b;
    return 0;
}
