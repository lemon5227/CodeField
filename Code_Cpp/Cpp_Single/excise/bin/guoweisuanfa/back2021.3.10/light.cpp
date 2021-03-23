#include "bits/stdc++.h"
using namespace std;
int main(){
    int a,b;
    bool light[1000]={0};
    cin >> a >> b;
    for(int i=1;i<=b;i++){
        for(int j=i;j<=a;j+=i)
        light[j]=!light[j];
    }
    for(int j=1;j<=a;j++)
        if(light[j]==1)
        cout<< j << " ";
}