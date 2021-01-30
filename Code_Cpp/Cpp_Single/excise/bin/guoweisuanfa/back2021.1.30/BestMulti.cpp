#include "iostream"
#include "algorithm"
#include "cstdio"
using namespace std;
int num[1000][1000];
const int INF = 9999999;
int a[1000];
int V(int m,int n){
    if(m==0)
        return num[1][n];
    if(n < m+1)
        return INF;
    else
    {
        int t=INF;
        for(int i=m;i<=n-1;i++)
            t = min(t,V(m-1,i)+num[i+1][n]);
        return t;
    }
     
}

int main(){
    int m,n;
    while(cin >> m >> n){
        for(int i=1;i<=n;i++){
            scanf("%d",&a[i]);
        }
        for(int i=1;i<=n;i++){
            num[i][i]=a[i];
            for(int j=i+1;j<=n;j++){
                num[i][j]=num[i][j-1]*10+a[j];
            }
        }
        cout << V(m,n) <<endl;
    }
    return 0;
}