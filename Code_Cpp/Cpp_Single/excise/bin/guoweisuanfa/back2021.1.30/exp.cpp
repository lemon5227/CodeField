//逆波兰表达式
#include "iostream"
#include "cstdio"
#include "cstdlib"
double exp();
using namespace std;
int main(){
    printf("%lf",exp());
    return 0;
}

double exp(){
    char s[20];
    cin >> s;
    switch(s[0]){
        case '+' : return exp()+exp();
        case '-' : return exp()-exp();
        case '*' : return exp()*exp();
        case '/' : return exp()/exp();
        default : return atof(s);
        break;
    }
}