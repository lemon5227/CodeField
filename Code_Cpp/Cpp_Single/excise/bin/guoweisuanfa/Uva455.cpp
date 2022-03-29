#include "bits/stdc++.h"
using namespace std;
int n;
int main(){
    cin >> n;
    while(n--){
        char a[85];
        cin >> a;
        getchar();
        int i=1;
        for(i; i<strlen(a); i++){
            int j=i;
            for(j;j<strlen(a);j++){
                if(a[j]!=a[j%i]){
                    break;
                }
            } +
            if(j==strlen(a)){
                cout << i<<endl<<endl;
                break;
            }
        }
        if(i == strlen(a)){
            cout << i<<endl<<endl;
        }
        if(n){
            cout <<endl;
        }
    }
    
}