#include "bits/stdc++.h"
using namespace std;
int main(){
    int n;
    cin >> n;
    int a[1000];
    for(int i = 0; i < n;i++){
        cin >> a[i];
    }
    int b;
    cin >> b;
    /*for(int i = b; i < n;i++){
        cout << a[i] << endl;
    }
    for(int i = 0; i <b;i++){
        cout << a[i] << endl;
    }*/
    for(int i = 0; i <n;i++){
        cout << a[(i+b)%n]<< " ";
    }
    return 0;
}