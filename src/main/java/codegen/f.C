#include <stdio.h>



int main(){
    int s = -1;
    int k = s;
    int b = s + 4 * k /2 - 1;
    int t = addOne(s);

    if (k<2){
       k = 3;
    } else{
       k = 4;
    }


    printf("%d\n", k);
}


int addOne(int a){
    int b = 1;
    return a+b;
}
