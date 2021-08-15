#include "bits/stdc++.h"
#define MaxSize 100
using namespace std;
typedef struct SeqStack{
    int data[MaxSize];
    int top; //栈顶元素
}SeqStack;

//初始化,直接将栈顶置为-1，就代表，栈内所有位置可用。
int initStack(SeqStack* stack){
    if(NULL == stack){
        return 0;
    }
    stack->top = -1;
    return 1;
}
int push(SeqStack* stack,char e){
    if(NULL == stack || MaxSize==stack->top+1){
        return 0;
    }
    stack->data[stack->top+1] = e;
    stack->top++;
    return 1;
}
int pop(SeqStack* stack,char* e){
    if(NULL == stack || NULL==e || stack->top==-1){
        return 0;
    }
    *e = stack->data[stack->top];
    stack->top--;
    return 1;
}
void EmptyorFull(SeqStack* stack){
    if(stack->top==-1){
        cout <<"stack is empty!"<<endl;
    }
    if(stack->top+1==MaxSize){
        cout <<"stack is full!"<<endl;
    }
    return;
}
int GetTop(SeqStack* stack,char* e){
    if(NULL == stack){
        return 0;
    }
    *e = stack->data[stack->top+1];
    return 1;
}
int GetStackLength(SeqStack* stack){
    if(NULL == stack){
        return 0;
    }
    return stack->top+1;
}
void showStack(SeqStack* stack) {
	if (NULL == stack||stack->top==-1) {
		return;
	}
	int i = stack->top;
	for (; i >=0; i--)
	{
		printf("%d\n", stack->data[i]);
	}
	return;
}
int main(){
    SeqStack s;
    initStack(&s);
    char queue[]={ '[','(',')',']','[',']' };
    char *p = queue;
    while(*p == '\0'){
        if(*p == '[' || *p== '(' ){
            push(&s,*p);
            p++;
        }
        else{
            char getpop;
            GetTop(&s,&getpop);
            if(getpop=='[' && *p == ']' || getpop == '(' && *p == ')'){
                char popchar;
                pop(&s,&popchar);
                p++;
            }
            else{
                cout << "It si wrong queue!" << endl;
                return 0;
            }
        }
    }
    if(s.top==-1){
        cout << "It is right queue" << endl;
    }else{
        cout << "It is wrong queue" << endl;
    }   
    return 0;
}