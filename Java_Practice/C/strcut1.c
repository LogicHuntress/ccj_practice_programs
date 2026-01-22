#include<stdio.h>
struct student {
    int id;
    char name[50];
    float marks;
};
int main(){
    struct student s1;
    printf("enter a s1 id : ");
    scanf("%d",&s1.id);
    printf("enter a s1 name : ");
    scanf("%s",s1.name);
    printf("enter a s1 marks : "); 
    scanf("%f",&s1.marks);

    printf("the student id is =%d\n",s1.id);
    printf("the student name is =%s\n",s1.name);
    printf("the student marks is =%.2f\n",s1.marks);

    return 0;

}