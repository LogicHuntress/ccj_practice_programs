// Character Frequency Count
#include<stdio.h>
#include<string.h>
int main()
{
    // first we take user of the string
    char str[100];
    int freq[256] = {0};  // its just an assumption 
    printf("enter the string name : ");
    scanf("%s",str);

    // we have to read the string to count the frequency
    for(int i = 0 ; str[i] != '\0'; i++){
        char ch = str[i];
        freq[ch]++;

    }

    // print the result only once the character
    for(int i = 0; str[i] != '\0'; i++){
        char ch = str[i];
        if (freq[ch] != 0) {
            printf("%c - %d\n",ch, freq[ch]);
             freq[ch] = 0;
        }
    }
    return 0;


}