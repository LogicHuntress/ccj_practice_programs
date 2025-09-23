//Calculate the length of a string without built-in functions, using pointers
#include <stdio.h>
int main() {
    char str[] = "bujji";
    char *p = str;
    int length = 0;
    while(*p != '\0') {
        length++;
        p++;
    }
    printf("Length = %d\n", length);
    return 0;
}
