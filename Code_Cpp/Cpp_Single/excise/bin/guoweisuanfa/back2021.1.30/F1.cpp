#include "iostream"
#include "cstring"
#include<algorithm>
bool cmp(int a,int b);
using namespace std;
int main(){
    string str[3]={"abd","bbb","add"};
    sort(str,str+3);
    for(int i=0;i<3;i++)
    cout << str[i];
}
