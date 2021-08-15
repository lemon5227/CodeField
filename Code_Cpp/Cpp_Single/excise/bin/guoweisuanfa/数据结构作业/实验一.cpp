#include"bits/stdc++.h"
using namespace std;
typedef struct{
    int grade;
    char name[40];
}lib;
typedef struct{
	lib *elem;
	int length;
}List;
//初始化
int init(List *L){
    L->elem = new lib[40];
    return 0;
}
//插入
void in(List *L){
    cout <<"请输入书籍价格和书名"<<endl;
    for(int i=0;i<40;i++){
        cin >> L->elem[i].grade;
        cin >> L->elem[i].name;
    }
}
//显示
void show(List *L){
    for(int i=0;i<40;i++){
        cout << L->elem[i].name << " :\t" << L->elem[i].grade << endl;
    }
}
//删除
void delete_n(List *L,int n){
    for(int i=n;i<39;i++){
        memcpy(L->elem[i].name,L->elem[i+1].name,sizeof(L->elem[i+1].name));
        L->elem[i].grade = L->elem[i+1].grade;
    }
}
int main(){
    List L;
    init(&L);
    return 0;
}