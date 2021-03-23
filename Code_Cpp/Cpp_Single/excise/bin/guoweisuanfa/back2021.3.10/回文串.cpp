#include "bits/stdc++.h"
using namespace std;
int main(){
    freopen("1.txt", "r", stdin);
    string s;
    cin >> s;
    int n=s.length();
    bool is= true;
    for(int i=0;i<n/2;i++){
        if(s[i] !=s[n-1-i])
            is=false;
    }
    cout << (is?"YES":"NO") <<endl;
    return 0;
}