#include"bits/stdc++.h"
#include"algorithm"
using namespace std;
int main(){
    long long n,m;
    cin >> n >> m;
    vector<vector<int>> arr(m);
    for(int i=0;i<m;i++){
        arr[i].resize(n);
    }
     vector<vector<int>> dp(m);
    for(int i=0;i<m;i++){
        dp[i].resize(n);
    }
    for(int i=0;i<m;i++){
        for(int j =0;j<n;j++){
            cin  >> arr[i][j];    
        }
    }
    long long maxnum = -999999999;
    for(int i=0;i<m;i++){
        for(int j=0;j<n;j++){
            arr[i][j] = max(max(max(arr[i][j],arr[i][j+1])，arr[i+1][j]),arr[i+1][j+1]);
        }
    }
  