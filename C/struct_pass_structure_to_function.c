//Pass structure to function (by value & by reference)
#include <stdio.h>
#include <string.h>

struct Student {
    char name[50];
    int roll;
    float marks;
};

// By value
void printStudentByValue(struct Student s) {
    printf("\n(By Value) Student: %s, Roll: %d, Marks: %.2f\n", s.name, s.roll, s.marks);
}

// By reference
void printStudentByReference(struct Student *s) {
    printf("\n(By Reference) Student: %s, Roll: %d, Marks: %.2f\n", s->name, s->roll, s->marks);
}

int main() {
    struct Student s;
    strcpy(s.name, "Ravi");
    s.roll = 101;
    s.marks = 88.5;

    printStudentByValue(s);
    printStudentByReference(&s);

    return 0;
}
