#include <stdio.h>

int a[15]={0};
int b = 12;


int main(){
    for(int i=0;i<4;i++){
        a[i]=i/2;
        b = b*2;
        printf("%d\n", a[i]);
    }

}
