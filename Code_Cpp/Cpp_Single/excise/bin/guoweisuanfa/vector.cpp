#include"bits/stdc++.h"
using namespace std;
int main(){
    vector<int>v1;
    vector<int>v2{1,2,3,4,};
    vector<long long>v3(20);
    //创建一个存string的动态数组，长度为20，存的都是“ywb”
    vector<string>v4(20,"ywb");
    //创建一个存Int的二维数组，一共3行，每行的列数可变
    vector<int>v5[3];
    //存int的二维数组，行列都可变
    vector<vector<int>>v6{{1,2},{1},{1,2,3}};
    int a = v6.size();
    cout << a;
    return 0;
}