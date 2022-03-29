#include <bits/stdc++.h>
using namespace std;
int main(){
		int n;
		cin>>n;
		bool flag; 
		string s;
		while(n--){			
			cin>>s;	
			int len=s.size();
			int TT =len;
			for(int T=1;T<80;T++){
				flag=true;
				for(int i=0;i+T<len;i++){
					if(s[i]!=s[i+T]){
						flag=false;
						break;
					} 
				}
				if(len%T==0&&flag==true){
					TT=T;						
					break;			
				}
			}		
			cout<<TT<<endl;	
			if(n){
				cout<<endl; 
			}
		}
		return 0;
	}	