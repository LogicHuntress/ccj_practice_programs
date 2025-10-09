//Copy one string to another using pointers
#include <stdio.h>

int main() {
    char source[100], dest[100];
    char *src, *dst;

    printf("Enter source string: ");
    scanf("%s", source);

    src = source;  // point to source
    dst = dest;    // point to destination

    while (*src != '\0') {
        *dst = *src;  // copy character
        src++;
        dst++;
    }
    *dst = '\0';  // end destination string

    printf("Destination string: %s\n", dest);

    return 0;
}
