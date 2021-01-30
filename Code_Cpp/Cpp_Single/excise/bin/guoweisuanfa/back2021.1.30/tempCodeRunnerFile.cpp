#include"iostream"
using namespace std;
void V(int);
int a[10];
int main(){
    int c;
    scanf("%d",&c);
    for(int i=0;i<c;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<c;i++){
        V(a[i]);
    }

    return 0;
}
void V(int k){
    
    if(k==1 || k==2 || k==3 || k==5 || k==7){
        printf("YES\n");
        return;
    }
    if(k== 0){
        printf("NO\n");
        return;
    }
    else if(k%2==0){
        k/=2;
        V(k);
    }
    else if(k%3==0){
        k/=3;
        V(k);
    }
    else if(k%5==0){
        k/=5;
        V(k);
    }
    else if (k%7==0)
    {
        k/=7;
        V(k);
    }
    else{
        printf("NO\n");
        return;
    }
}