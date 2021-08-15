#include "bits/stdc++.h"
using namespace std;
int a[100][100],v[100][100];
struct point{
    int x,y;
    int step;
};
queue<point> r;
int  dx[4]={0,1,0,-1};
int  dy[4]={1,0,-1,0};
int main(){
    int n,m,startx,starty,p,q;
    cin >> n >> m;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=m;j++){
            cin >> a[i][j];
        }
    }
    cin >> startx >> starty >> p >> q;
    point start;
    start.x = startx;
    start.y = starty;
    start.step = 0;
    r.push(start); //将起点入队
    v[startx][starty] = 1;
    int flag=0;
    while(!r.empty()){
        int x=r.front().x, y=r.front().y;
        if(x == p && y==q){
            flag = 1;
            cout << r.front().step<<endl;
            break;
        }
        for(int k=0;k<=3;k++){
            int tx,ty;
            tx=x+dx[k];
            ty=y+dy[k];
            if(a[tx][ty] == 1 && v[tx][ty] == 0){
                point temp;
                temp.x = tx;
                temp.y=ty;
                temp.step = r.front().step+1;
                r.push(temp);
                v[tx][ty]=1;
            }
        }
        r.pop();
    }
    if(flag ==0){
        cout << "No Answer!"<< endl;
    }
    return 0;
}