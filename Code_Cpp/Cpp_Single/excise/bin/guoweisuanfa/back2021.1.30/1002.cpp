#include "iostream"
#include "algorithm"
#include "cstring"
#include "cstdio"
using namespace std;
long long a[40][40];
int b[40][40];
int main(){
    int x,y,m,n;
    cin >> m>> n>> x>> y;
    int mx[8]={2,1,-1,-2,-2,-1,1,2};
    int my[8]={1,2,2,1,-1,-2,-2,-1};
    b[x][y]=1;
    for(int i=0;i<8;i++){
        if(x+mx[i]>=0 && x+mx[i]<=m && y+my[i]>=0 && y+my[i]<=n)
            b[x+mx[i]][y+my[i]]=1;
    }
    for(int i=0;i<=m && b[i][0]!=1;i++)
        a[i][0]=1;
    
    for(int i=0;i<=n && b[0][i]!=1;i++)
        a[0][i]=1;
    
    for(int i=1;i<=m;i++){
        for(int j=1;j<=n;j++){
            if(b[i][j])
                a[i][j]=0;
            else
            {
                a[i][j]=a[i-1][j]+a[i][j-1];
            }
        }
    }
    cout <<a[m][n] << endl;
    return 0;
}