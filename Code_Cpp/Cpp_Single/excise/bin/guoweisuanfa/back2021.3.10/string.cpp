#include "bits/stdc++.h"
using namespace std;
int main(){
    string s;
    cin >> s;
    int n;
    n=s.length();
    bool ok = false;
    for(int i=0; i<=4;i++){
        string t= s.substr(0,i)+s.substr(n-(4-i));
        if(t=="2021")
            ok = true;
    }
    cout << (ok ? "Yes" : "No") <<endl;
    return 0;
}