#include"bits/stdc++.h"
#define ll long long
using namespace std;
int a[101]={0};
int main(){
	for(int i =2;i<=100;i++){
		int temp=i;
		for(int j=2;j*j<temp;j++){
			if(temp%j==0){
				while(temp&j==0){
					a[j]++;
					temp/=j;
				}
			}
		}
		if(temp!=1){
			a[temp]++;
		}
	}
	ll ans=1;
	for(int i=1;i<=100;i++){
		if(a[i]){
			ans = ans*(a[i]+1);
		}
	}
	cout << ans  << endl;
	return 0;
}