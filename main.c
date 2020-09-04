#include<stdio.h>
int main()
{
    int x=45,y=98;
    printf("before swap x=%d y=%d",x,y);
    x=x+y;
    y=x-y;
    x=x-y;
    printf("\nafter swapping x=%d y=%d",x,y);
    return 0;
}
