#include"bits/stdc++.h"
using namespace std;
int main(){
    string s1,s2;
    cin >> s1 >> s2;
    int m,n;
    m=s1.size();
    n=s2.size();
    vector<vector<int>> dp(m+1,vector<int>(n+1,0));
    for(int i=0;i<=m;i++){
        dp[0][i]=i;
        dp[i][0]=i;
    }
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(s1[i-1]==s2[j-1])
                dp[i][j]=dp[i-1][j-1];
            else
                dp[i][j]=min(dp[i-1][j],min(dp[i][j-1],dp[i-1][j-1]))+1;
        }
    }
    cout <<dp[m][n] << endl;
}
