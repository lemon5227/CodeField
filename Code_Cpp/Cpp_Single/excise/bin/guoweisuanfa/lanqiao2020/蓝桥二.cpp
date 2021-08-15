#include"bits/stdc++.h"
using namespace std;
char a[10000][10000];
int dx[4]={0,1,0,-1};
int dy[4]={1,0,-1,0};
struct node {
    int x,y;
    int step;
};
queue<node> q;
void bfs(){
    q.push({3000,3000,0});
    q.push({5020,3011,0});
    q.push({3011,3014,0});
    q.push({5000,5000,0});
    while(q.size()){
        int x= q.front().x,y= q.front().y,z=q.front().step; 
        q.pop();
        if(z==2020)return;
        int tx,ty;
        for(int i=0;i<4;i++){
            tx = x+dx[i]; ty = y+dy[i];
            if(a[tx][ty] !='*'){
                a[tx][ty] ='*';
                q.push({tx,ty,z+1}); 
            }
        } 
    }

}
int main(){
    memset(a,1,sizeof(a));
    a[3000][3000]='*';
    a[5020][3011]='*';
    a[3011][3014]='*';
    a[5000][5000]='*';
    bfs();
    int count=0;
    for(int i=0;i<10000;i++){
        for(int j=0;j<10000;j++){
            if(a[i][j]=='*'){
                count++;
            }
        }
    }
    cout << count<<endl;
}