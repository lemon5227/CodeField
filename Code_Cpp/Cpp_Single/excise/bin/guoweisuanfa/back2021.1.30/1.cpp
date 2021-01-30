/*
最佳加法表达式：
题意：
有一个由1..9组成的数字串.问如果将m个加号插入到这个数字串中,在各种可能形成的表达式中，值最小的那个表达式的值是多少。
输入：
5 3
1 2 3 4 5
输出：
24

*/
/*
预处理和排序都能很好的减少耗时
*/
#include<iostream>
#include<cstdio>
#include<cstring>
#include<algorithm>
using namespace std;
const int INF=0x3f3f3f3f;
const int N=1005;
int a[N],num[N][N],dp[N][N];
//a[N]里面是存数字串
//num[i][j]表示数字串a[N]的第i位到第j位之间的数字串表示的数组
//dp[i][j]在i个数字中插入j个加号所能形成的表达式最小值
int main(){
    int n,m;
    while(scanf("%d %d",&n,&m)){
        for(int i=1;i<=n;i++){
            scanf("%d",&a[i]);
        }
        //预处理,计算i到j数字串组成的数字
        for(int i=1;i<=n;i++){
            num[i][i]=a[i];//只有一个数字
            for(int j=i+1;j<=n;j++){
                num[i][j]=num[i][j-1]*10+a[j];
            }
        }
        memset(dp,0x3f,sizeof(dp));
        for(int i=1;i<=n;i++){
            dp[0][i]=num[1][i];//无加号时
        }
        //其实就是感觉在那个位置放不放加号
        //这里n可以写在m前面。要加一个限制条件n>m，好麻烦，所以m在前且n=m+1
        //这里k的取值范围就是m到n，k表示在第k个数后面插入加号
        for(int i=1;i<=m;i++)
            for(int j=i;j<=n;j++)
                for(int k=i;k<=j;k++)
                    dp[i][j]=min(dp[i][j],dp[i-1][k]+num[k+1][j]);
        cout<<dp[m][n]<<endl;
    }
}