#include <stdio.h>

struct Student {
    int id;
    char name[50];
    float marks;
};

int main() {
    struct Student s[5];  // array of 5 students
    int i;

    // input
    for(i = 0; i < 5; i++) {
        printf("Enter details of student %d:\n", i+1);
        printf("ID: ");
        scanf("%d", &s[i].id);

        printf("Name: ");
        scanf("%s", s[i].name);  

        printf("Marks: ");
        scanf("%f", &s[i].marks);
    }

    // output
    printf("\n--- Student Details ---\n");
    for(i = 0; i < 5; i++) {
        printf("ID: %d\t Name: %s\t Marks: %.2f\n", s[i].id, s[i].name, s[i].marks);
    }

    return 0;
}
