//Compare two structures
#include <stdio.h>
#include <string.h>

struct Student {
    char name[50];
    int roll;
    float marks;
};

int main() {
    struct Student s1 = {"Ravi", 101, 88.5};
    struct Student s2 = {"Raji", 102, 86.5};

    if(strcmp(s1.name, s2.name) == 0 && s1.roll == s2.roll && s1.marks == s2.marks) {
        printf("Both students have same data.\n");
    } else {
        printf("Students data is different.\n");
    }

    return 0;
}
