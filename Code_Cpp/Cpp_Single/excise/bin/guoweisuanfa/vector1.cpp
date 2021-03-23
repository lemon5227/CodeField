#include "bits/stdc++.h"
using namespace std;
int main(){
    vector<int>v{1,2,3,4};
    v.push_back(5);
    for(auto i=v.begin();i!=v.end();i++){
        cout << *i <<endl;
    }
    v.erase(v.begin()+2);
    v.insert(v.begin()+2,666);
    v.front()=10;
    v.back()=50;
    for(auto i:v){
        cout << i <<endl;
    }

    return 0;
}