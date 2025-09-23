#include<iostream>
using namespace std;

int main()
{
    int arr[5] = {2,3,4,5,6};
    int start = 0;          // index
    int end = 4;            // last index (size-1)
    int temp;

    while (start < end) {
        temp = arr[start];
        arr[start] = arr[end];
        arr[end] = temp;

        start++;
        end--;
    }

    cout << "The reverse order is: ";
    for(int i = 0; i < 5; i++) {
        cout << arr[i] << " ";
    }
    cout << endl;

    return 0;
}
