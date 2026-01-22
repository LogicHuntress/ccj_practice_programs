//Move All Zeroes to End of Array
#include <iostream>
using namespace std;

int main() {
    int n, arr[100], j = 0;
    cout << "Enter number of elements: ";
    cin >> n;

    cout << "Enter array elements: ";
    for (int i = 0; i < n; i++)
        cin >> arr[i];

    for (int i = 0; i < n; i++) {
        if (arr[i] != 0)
            arr[j++] = arr[i];
    }
    while (j < n)
        arr[j++] = 0;

    cout << "Array after moving zeroes: ";
    for (int i = 0; i < n; i++)
        cout << arr[i] << " ";
}
