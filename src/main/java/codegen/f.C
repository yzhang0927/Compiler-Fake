#include <stdio.h>

int simpleAdd(int a){
    return a+1;
}

int main(){

    int s = -1;
    int v = s;
    int k = simpleAdd(s);

    printf("%d\n", k);
    printf("%d\n", 16);
    printf("%d\n", 3*11-5);
    //printf("%d\n", s-1);
    //printf("%d\n", s-v);
    //printf("%d\n", s);

}