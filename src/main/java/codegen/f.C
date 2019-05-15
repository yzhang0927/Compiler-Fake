#include <stdio.h>



int main(){
    int s = -1;
    int k = s;
    int b = s + 4 * k /2 - 1;
    int t = addOne(s);

    if (s>=4 ){
        s = s + 3;
    } else if(s<0){
        s = 2;
    } else{
        s = 1;
    }

    printf("%d\n", s);
}


int addOne(int a){
    int b = 1;
    return a+b;
}
