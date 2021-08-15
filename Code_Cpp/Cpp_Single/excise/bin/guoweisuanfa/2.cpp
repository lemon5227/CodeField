#include"bits/stdc++.h"
using namespace std;
int main(){
    int a=5;
    int *p = &a;
    int **q = &p;
    printf("%p\n",p);
    printf("%p\n",&p);
    printf("%d",q);
}