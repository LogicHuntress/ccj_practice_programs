//Compare uninitialized vs zero-initialized array (like malloc vs calloc)
#include <iostream>
using namespace std;

int main() {
    int n;
    cout << "Enter size: ";
    cin >> n;

    int *arr1 = new int[n];           // Uninitialized
    int *arr2 = new int[n]();         // Zero-initialized

    cout << "Uninitialized (new) values: ";
    for(int i=0;i<n;i++) cout << arr1[i] << " ";

    cout << "\nZero-initialized (new int[n]()) values: ";
    for(int i=0;i<n;i++) cout << arr2[i] << " ";

    delete[] arr1;
    delete[] arr2;
    return 0;
}
