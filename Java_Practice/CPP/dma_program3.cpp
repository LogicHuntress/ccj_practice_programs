//Input n numbers dynamically and print sum
#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter number of elements: ";
    cin >> n;

    int *arr = new int[n];

    for(int i=0;i<n;i++){
        cout << "Enter element " << i+1 << ": ";
        cin >> arr[i];
        sum += arr[i];
    }

    cout << "Sum = " << sum << endl;
    delete[] arr;
    return 0;
}
