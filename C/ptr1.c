#include <stdio.h>
int main()
 {
    int num = 10;  
    int *ptr;        
    ptr = &num;       
    printf("Value of num = %d\n", num);
    printf("Address of num = %p\n", &num);
    printf("Value using pointer = %d\n",*ptr );
    printf("Address stored in ptr = %p\n", ptr);
    return 0;
}
