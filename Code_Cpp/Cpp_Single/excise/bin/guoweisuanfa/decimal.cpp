#include"bits/stdc++.h"
using namespace std;
int main(){
    double a,b,c;
    double sum;
    int n=1;
    while(n){
        cin >> a >> b >> c;
        sum=a/b;
        cout << setprecision(c) << sum << endl;
        if(a==0 && b==0 && c==0)
        break;
    }
}