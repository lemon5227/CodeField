#include "bits/stdc++.h"
using namespace std;
typedef struct BiTree {
    char data;
    struct BiTree *lchild;
    struct BiTree *rchild;
}BiTree;

void InitTree(BiTree *T){
    T->data = '0';
    T->lchild = new BiTree;
    T->rchild = new BiTree;
}
void CreateBiTree(BiTree *T){
    char ch;
    cin >> ch;
    if(ch == '#'){
        T=NULL;
    }else
    {
        T = new BiTree;
        T->data = ch;
        CreateBiTree(T->lchild);
        CreateBiTree(T->rchild);
    }
}
void LDR(BiTree *T){
    if(T == NULL){
        return;
    }else{
        LDR(T->lchild);
        cout << T->data;
        LDR(T->rchild);
    }
}

int Nodenum(BiTree *T){
    if(T == NULL){
        return 0;
    }else{
        return 1+Nodenum(T->lchild) + Nodenum(T->rchild);
    }
}

int Depth(BiTree *T){
    int m=0,n=0;
    if(T == NULL){
        return 0;
    }else{
        m=Depth(T->lchild)+1;
        n=Depth(T->rchild)+1;
        if(m > n){
            return m+1;
        }else{
            return n+1;
        }
    }
}

int main() {
    BiTree T;
    CreateBiTree(&T);
    //cout << Depth(&T);
    LDR(&T);
}