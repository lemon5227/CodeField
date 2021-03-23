#include "bits/stdc++.h"
using namespace std;
int main(){
    int m,n;
    cin >> m >> n ;
    vector<vector<int>> dp(m+1,vector<int>(n+1,0));
    for(int i=1;i<=m;i++){
        dp[i][1] = 1;
    }
    for(int j=1;j<=n;j++){
        dp[1][j] = 1;
    }
    for(int i=2;i<=m;i++){
        for(int j=2;j<=n;j++){
            dp[i][j] =dp[i][j-1]+dp[i-1][j];
        }
    }
    cout << dp[m][n] << endl;
}
