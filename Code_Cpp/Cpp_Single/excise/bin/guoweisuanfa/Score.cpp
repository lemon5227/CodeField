#include"bits/stdc++.h"
using namespace std;
int n;
char a[100];
int main(){
    cin >>n;
    for(int i=0;i<n;i++){
        cin >>a;
        int count = strlen(a);
        int score =0;
        int temp=0;
        for(int j=0;j<count;j++){
            if(a[j]=='O'){
                temp++;
                score +=temp;
            }
            else{
                temp=0;
                score +=temp;
            }
        }
        cout << score << endl;
    }
    return 0;
}