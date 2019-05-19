#include <stdio.h>


int aa = 2;

int display(int n[])
{
int b[5];
    return n[0]+n[1];
}


int main(){
int a[5];
a[1] = aa;
//a[1] = 3;
//a[3] = a[0]+a[1];
printf("%d ",display(a));
}

