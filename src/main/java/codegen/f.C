#include <stdio.h>

int a[5];

void display(int n[])
{
    for(int i=0; i<5; i++)
        printf("%d ",n[i]);
}

void displayInt(int a){
    printf("%d ",a);
}

int main(){
    for(int i=0; i<5;i++ ){
        a[i]=i+1;
    }
    display(a);
}

