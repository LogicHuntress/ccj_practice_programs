//Access & modify structure members using pointer
#include <stdio.h>
#include <string.h>

struct Student {
    char name[50];
    int roll;
    float marks;
};

int main() {
    struct Student s = {"Ravi", 101, 88.5};
    struct Student *ptr = &s;

    printf("Original Name: %s\n", ptr->name);

    strcpy(ptr->name, "Kiran");  // Modify using pointer
    ptr->marks = 95.0;

    printf("Modified Name: %s, Marks: %.2f\n", ptr->name, ptr->marks);

    return 0;
}
