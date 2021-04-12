//今年是2021年，请问数字1到数字2021中，出现了多少个数字6
#include"bits/stdc++.h"
using namespace std;
int main(){
    int cnt = 0;
    for(int i =1;i<2021;i++){
        int num = i;
        while(num){
            if(num % 10 == 6){
                cnt++;
            }
            num/=10;
        }
    }
    cout << cnt;
}