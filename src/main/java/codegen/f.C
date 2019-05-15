#include <stdio.h>

int a = 15;
int b = 12;
int main(){
    int s = 3;
    int k = 2;

    int t = s;
    s = k;
    k = t;

    k = addOne(s);
    printf("%d\n", k);

}


int addOne(int a){
    printf("%d\n", a);
    b = 1;
    printf("%d\n", a);
    return a+b;
}
