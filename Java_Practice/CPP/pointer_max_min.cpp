//Find maximum and minimum element in an array using pointers
#include <iostream>
using namespace std;
int main() {
    int arr[] = {5, 2, 9, 1, 7};
    int *p = arr;
    int max = *p, min = *p;
    for(int i=1; i<5; i++) {
        if(*(p+i) > max) max = *(p+i);
        if(*(p+i) < min) min = *(p+i);
    }
    cout << "Max = " << max << ", Min = " << min << endl;
    return 0;
}

