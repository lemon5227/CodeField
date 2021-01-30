//通过将二维数组变成一维数组优化空间
#include "iostream"
#include"algorithm"
using namespace std;
#define MAX 101
int n;
int D[MAX][MAX];
int maxSum[MAX];

int main(){
    int i,j;
    cin >> n;
    for(i=1;i<=n;i++){
        for(j=1;j<=i;j++){
            cin >> D[i][j];
        }
    }
    for(i=1;i<=n;i++)
        maxSum[i] = D[n][i];
    for(int i = n-1; i>=1;--i)
        for(int j = 1; j<=i; j++)
            maxSum[j]=max(maxSum[j],maxSum[j+1]) + D[i][j];
    cout << maxSum[1] << endl;

}