#include<stdio.h>
main()
{
int n,r,sum;
printf("enter the number");
scanf("%d",&n);
while(n>0)
{
    r=n%10;
    sum=sum+r;
    n=n/10;
}
}