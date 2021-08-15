#include"bits/stdc++.h"
using namespace std;
int main(){
    string arr[10];
    int n;
    cin >> n;
    for(int i=0;i<n;i++){
        cin >> arr[i];
    }
    int count = 0;
    string a="@wyk";
    for(int i = 0;i<n;i++){
        string::size_type idx = arr[i].find(a);
        if ( idx != string::npos ){
            count++;
        }
    }
    cout << count;
}