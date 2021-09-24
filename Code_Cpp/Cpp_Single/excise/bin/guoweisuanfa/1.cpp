#include<bits/stdc++.h>
using namespace std;
int main(void){
    int n;
    string s;
    string p = "wawa";
    string p2 = "wa";
    while(cin >> s) {
        int cnt = 0;
        int cnt1 =0;
        size_t found = s.find(p, 0); //若没有找到则返回 string::npos，找到了则返回第一次出现p的位置
        size_t found1 = s.find(p2, 0);
        while(found1 != string::npos) {
            ++cnt1;
            found1 += 1;
            if(found1 >= s.size()) break;
            found1 = s.find(p2, found1);
        }
        while(found != string::npos) {
            ++cnt;
            found += 3;
            if(found >= s.size()) break;
            found = s.find(p, found);
        }
        cout << cnt1 << endl;
        cout << cnt;
    }
    return 0;
}