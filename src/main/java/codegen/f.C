#include <stdio.h>

int a = 15;
int b = 12;

int fib(int a){
    if(a<1) return 0;
    else return a+fib(a-1);
}

int main(){
    printf("%d\n", fib(2));
}


int addOne(int a){
    printf("%d\n", a);
    b = 1;
    printf("%d\n", a);
    return a+b;
}
