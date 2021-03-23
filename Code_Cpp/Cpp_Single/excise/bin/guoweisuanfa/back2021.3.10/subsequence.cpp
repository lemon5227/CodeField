#include"bits/stdc++.h"
using namespace std;
int main(){
    long long  n,m;
    double t=0;
    while(n!=0 && m!=0)
    {    
        cin >> n >> m;
        for(long long i=n;i<=m;i++){
            t+=1.0/(i*i);
        }
        cout << setprecision(5)<< t << endl;
    }
    
}