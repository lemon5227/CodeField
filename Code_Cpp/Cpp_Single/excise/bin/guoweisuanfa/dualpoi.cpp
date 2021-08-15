#include"bits/stdc++.h"
using namespace std;
int main(){
    int a[4]={3,2,2,3};
    int slowpoi = 0;
    int val=3;
    for(int fastpoi = 0;fastpoi < 4;fastpoi++){
        if(a[fastpoi]!=val){
            a[slowpoi++]=a[fastpoi];
        }
    }
    for(int i=0;i<slowpoi;i++){
        cout << a[i] <<endl;
    }
    return 0;
}