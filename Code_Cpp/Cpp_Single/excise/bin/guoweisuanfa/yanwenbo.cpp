#include"bits/stdc++.h"
using namespace std;
#define MAX 40

typedef struct{
	char name[MAX];
	int value;
}library;
typedef struct{
	library *elem;
	int length;
}Sqlist;
int  Init(Sqlist *L){
	L.elem = new library[MAX];
	if(!L.elem){
		return 0;
	}
	else 
	return 1;
}
void in(Sqlist *L){
	int n;
	cout << "请输入数据个数"<<endl;
	cin >> n;
	L.length = n;
	for(int i=0;i<n;i++){
		cout << "输入"<< i<<"书名和价格"<<endl;
		cin >> L.elem[i].name >> L.elem[i].value; 
	} 
};
void show(Sqlist *L){
	for(int i=0;i<L.length; i++){
	cout <<  L.elem[i].name << endl;
	cout <<  L.elem[i].value <<endl;
	}	
};
int mian(){
	library lib[MAX];
	Sqlist L;
	if(Init(&L)){
		
	}
	in(&L);
	show(&L); 
	
	
}
