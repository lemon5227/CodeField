#include "bits/stdc++.h"
using namespace std;
double trans(char c);
    char a[1024];
    
int main(){
    int n;
    cin >> n;
    while(n--){
    double sum = 0;
    memset(a, 1, sizeof(a));
    cin >> a;
    int n = strlen(a);
    
    for(int i=0; i<n; i++){
        int count = 0;
        while(!isalpha(a[i+1]) && i!=n-1){
            i++;
            count++;
        }
        if(count==0){
            sum += trans(a[i]);
        }else{
            int num = atoi(a+i-count+1); 
            sum += trans(a[i-count])*num;
        }         
    }

    printf("%.3f\n", sum);
    }
    
    return 0;
}

double trans(char c){
    if(c == 'C')
        return 12.01;
    if(c == 'H')
        return 1.008;
    if(c == 'N')
        return 14.01;
    if(c == 'O')
        return 16.00;

    return 0;
}