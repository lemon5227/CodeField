#include"bits/stdc++.h"
using namespace std;
int main(){
    int fac[15];
    fac[0]=1;
    fac[1]=1;
    double newarr[13];
    for(int i=2;i<15;i++){
        fac[i]=fac[i-1]+fac[i-2];
    }
    for(int i=0;i<13;i++){
        newarr[i]=1.0/(fac[i]*fac[i+1]);
    }
    int sum=0;
    for(int i=0;i<13;i++){
        sum=newarr[i];
    }
    cout << sum;
}