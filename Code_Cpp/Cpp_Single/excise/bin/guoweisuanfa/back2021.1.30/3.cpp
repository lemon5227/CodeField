#include "iostream"
using namespace std;
int a[999999];
bool isUgly(int num){

while(num)
{
    if(num%7==0)num/=7;
    else if(num%5==0)num/=5;
    else if(num%3==0)num/=3;
    else if(num%2==0)num/=2;
    else break;
}
return num==1;
}
int main(){
    int n;
    scanf("%d",&n);
    for(int i=0;i<n;i++)
        scanf("%d",&a[i]);
    for(int i=0;i<n;i++){
        if(isUgly(a[i]))
            printf("Yes\n");
        else 
            printf("No\n");
    }
    return 0;
}