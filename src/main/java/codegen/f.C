#include <stdio.h>

int a=2;

int main(){
    int s = -1;
    int k = a;
    int b = s + 4 * k /2 - 1;
    int t = addOne(s);

    if (k<2){
       k = 3;
    } else{
       k = 4;
    }


    printf("%d\n", a);
}


int addOne(int a){
    int b = 1;
    printf("%d\n", b);
    return a+b;
}
