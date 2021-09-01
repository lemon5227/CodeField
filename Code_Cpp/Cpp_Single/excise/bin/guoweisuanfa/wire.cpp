#include "bits/stdc++.h"
using namespace std;
int main(){
    int num;
    cin >> num;
    while(num--){
        int sum = 0;
        int n;
        cin >> n;
        sum = (n-(int)(n/3))/2+n-(int)(n/2);
        cout << sum << endl;
    }
}