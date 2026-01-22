//Remove Duplicates
#include <stdio.h>
#include <string.h>

int main() {
    char str[100];
    printf("Enter a string: ");
    gets(str);

    char result[100];
    int k = 0;
    for(int i = 0; str[i] != '\0'; i++) {
        int j;
        for(j = 0; j < k; j++) {
            if(str[i] == result[j]) break;
        }
        if(j == k) result[k++] = str[i];
    }
    result[k] = '\0';
    printf("String after removing duplicates: %s\n", result);
    return 0;
}
