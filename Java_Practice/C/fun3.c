#include<stdio.h>
#include<math.h>

int isprime(int n){
    if(n <= 1)
        return 0;

    for(int i = 2; i <= sqrt(n); i++){
        if(n % i == 0)
            return 0; // not prime
    }
    return 1; // prime
}

int main(){
    int n;
    printf("Enter a number: ");
    scanf("%d", &n);

    int result = isprime(n); // function call

    if(result)
        printf("%d is a Prime Number\n", n);
    else
        printf("%d is Not a Prime Number\n", n);

    return 0;
}
