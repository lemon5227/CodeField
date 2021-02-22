#include"bits/stdc++.h"
using namespace std;
int main(){
    int i;
    int a,b,c,d,e,f,g,h,o;
    for(i=123;i<333;i++){
        int t=i;
        a=t/100;
        b=t/10%10;
        c=t%100;
        d=2*t/100;
        e=2*t/10%10;
        f=2*t%100;
        g=3*t/100;
        h=3*t/10%10;
        o=3*t%100;
        if(a!=b && a!=c && a!=d && a!=e && a!=f && a!=g && a!=h && a!=o && b!=c && b!=d && b!=e && b!=f && b!=g && b!=h && b!=o && c!=d && c!=e && c!=d && c!=e && c!=g && c!=h &&c!=o && d!=e && d!=f && d!=g && d!=h && d!=o && e!=f && e!=g && e!=h && e!=o && f!=g && f!=g && f!=g && f!=g && f!=h && f!=o && g!=h && g!=o && h!=o && a!=0 && b!=0 && c!=0 && d!=0 && e!=0 && f!=0 && g!=0 && h!=0 && o!=0)
        cout << i << " " <<2*i << " " <<3*i << " " <<endl;
    }
}