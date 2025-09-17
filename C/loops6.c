// N natural even numbers 
/*#include<stdio.h>
int main()
{
    int n, i=1;
    printf("ENTER N :");
    scanf("%d",&n);
    while(i<=n){
        printf("%d ",2*i);
        i++;
    }
    return 0;
}  */

#include<stdio.h>
int main()
{
    int n;
    printf("ENTER : ");
    scanf("%d",&n);

    for(int i=1 ; i<=n; i++){
        printf("%d ",2*i);
    }
    return 0;
}