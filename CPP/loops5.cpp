// sum of first N natural numbers squares
/*#include<iostream>
using namespace std;
int main()
{
    int n, sum  = 0;
    cout<<"ENTER N : ";
    cin>>n;
    for(int i = 1; i<=n; i++){
        sum += i*i;

        cout<<"sum of first N natural numbers squares  : "<<sum<<endl;

    }
    return 0;
    
} */

#include <iostream>
using namespace std;

int main() {
    int n, sum = 0;
    cout << "Enter n: ";
    cin >> n;

    for (int i = 1; i <= n; i++) {
        sum += i * i;
        if (i < n)
            cout << i << "^2 + ";
        else
            cout << i << "^2 = ";
    }

    cout << sum << endl;
    return 0;
}
