#include<bits/stdc++.h>
#include<iostream>
using namespace std;
int main(){
    freopen("1.txt","r",stdin);
    int n;
    set<string> s;
    cin >> n;
    for(int i=0;i<n;i++){
        string name;
        cin >>name;
        s.insert(name);
    }
    int m,ave=0;
    map<string,int>mp;
    cin>> m;
    for(int i=0;i<m;i++){
        string name;
        int a;
        cin >> name >>a;
        ave +=a;
        mp[name] = a;
    }
    ave/=m;

    int f=0;
    for(auto i:mp){
        if(i.second>ave && s.count(i.first)==0){
            if(f)cout <<"\n";
            cout<<i.first;
            f=1;
        }
        if(f==0)
        cout << "bingmeiyou"<< endl;
        
    }
    

}