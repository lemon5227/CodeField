#include "bits/stdc++.h"
using namespace std;
#define c 12.010
#define h 1.008
#define o 16.00
#define n 14.01
char a[100];
int m;
int main(){
    cin >>m;
    for(int i=0;i<m;i++){
        cin >> a;
        double mol=0;
        for(int j=0;j<strlen(a);j++){
            if(a[j]=='C'){
                if(a[j+1]>'1' && a[j+1]<'9'){
                    mol+=(a[j+1]-48)*c;
                }
                else
                mol+=c;
            }
            if(a[j]=='H'){
                if(a[j+1]>'1' && a[j+1]<'9'){
                    mol+=(a[j+1]-48)*h;
                }
                else
                mol+=h;
            }
            if(a[j]=='O'){
                if(a[j+1]>'1' && a[j+1]<'9'){
                    mol+=(a[j+1]-48)*o;
                }
                else
                mol+=o;
            }
            if(a[j]=='N'){
                if(a[j+1]>'1' && a[j+1]<'9'){
                    mol+=(a[j+1]-48)*n;
                }
                else
                mol+=n;
            }                                              
        }
        printf("%.3lf\n",mol);
    }
}