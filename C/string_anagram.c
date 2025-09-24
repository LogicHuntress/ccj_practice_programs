//Anagram Check
#include <stdio.h>
#include <string.h>
#include <ctype.h>

void sortString(char str[]) {
    int len = strlen(str);
    for(int i = 0; i < len-1; i++) {
        for(int j = i+1; j < len; j++) {
            if(str[i] > str[j]) {
                char temp = str[i];
                str[i] = str[j];
                str[j] = temp;
            }
        }
    }
}

int main() {
    char str1[100], str2[100];
    printf("Enter first string: ");
    gets(str1);
    printf("Enter second string: ");
    gets(str2);

    if(strlen(str1) != strlen(str2)) {
        printf("Not an anagram\n");
    } else {
        sortString(str1);
        sortString(str2);
        if(strcmp(str1, str2) == 0) printf("Anagram\n");
        else printf("Not an anagram\n");
    }
    return 0;
}
