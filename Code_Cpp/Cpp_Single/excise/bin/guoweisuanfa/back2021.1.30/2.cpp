#include"stdio.h"
int a[1000];
int main(){
    int c;
    scanf("%d",&c);
    for(int i=0;i<c;i++){
        scanf("%d",&a[i]);
    }
    for(int i=0;i<c;i++){
        if(a[i]<=0) printf("No\n");
        else
        while (a[i])
        {
            if(a[i]==1 || a[i]==2 || a[i]==3 || a[i]==5 || a[i]==7){
                printf("Yes\n");
                break;
            }
            else if(a[i]%2==0)
                a[i]/=2;
            else if(a[i]%3==0)
                a[i]/=3;
            else if(a[i]%5==0)
                a[i]/=5;
            else if(a[i]%7==0)
                a[i]/=7;
            else
            {
                printf("No\n");
                break;
            }
        }
    }
    return 0;
}