//Allocate memory for a string using malloc()
#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main() {
    char *str = (char*)malloc(100 * sizeof(char));

    printf("Enter a sentence: ");
    fgets(str, 100, stdin);

    printf("You entered: %s\n", str);
    free(str);
    return 0;
}
