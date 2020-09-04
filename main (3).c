#include<stdio.h>
int togetMissingNo(int x[], int n)
{
    int i,totalno;
    totalno = (n + 1) * (n + 2) / 2;
    for (i = 0; i < n; i++)
        totalno -= x[i];
    return totalno;
}
int main()
{
    int x[] = {1,2,4,6,3,7,8};
    int missingno = togetMissingNo(x,5);
    printf("%d", missingno);
    getchar();
}