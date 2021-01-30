#include "iostream"
#include "cmath"
using namespace std;
int N;
int queenpos[100];

void Nqueen(int k);
int main(){
    cin >> N;
    Nqueen(0);
    return 0;
}
void Nqueen(int k){
    int i;
    if(k==N){
        for(i=0;i< N; i++)  
            cout <<queenpos[i] + 1 << " ";
        cout << endl;
        return ; 
    }
    for(i= 0;i< N; i++){
        int j;
        for(j=0;j<k;j++){
            if(queenpos[j]==i || abs(queenpos[j]-i) == abs(k-j))
                break;
        }
        if(j==k){
            queenpos[k]=i;
            Nqueen(k+1);
        }
    }
}