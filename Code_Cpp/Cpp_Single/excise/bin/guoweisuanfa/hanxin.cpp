#include"iostream"
#include"bits/stdc++.h"
using namespace std;
int main(){
    int a,b,c;
    int n=0;
    int m;
    cin >> m;
    while(m>0){
    n=0;
    cin >> a >> b >> c ;
    for(int i=10;i<=100;i++){
        if(i%3==a && i%5==b && i%7==c){
            cout <<" This is "<< i<<endl;
            n=1;
        }
    }
    if(n==0)
        cout <<"No Answer!";
    m--;
    }
}