#include "bits/stdc++.h"
using namespace std;
int main(){
    queue<int> q;
    q.push(1);
    q.push(2);
    for(auto i=0; i<q.size();i++){
        cout << q.back() <<endl;
        q.pop();
    }
}